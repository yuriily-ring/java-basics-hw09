import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        // TODO fill in code here
        ArrayList<String> commonItems = new ArrayList<>();
        Set<String> array1Items = new HashSet<>(Arrays.asList(array1));
        Set<String> array2Items = new HashSet<>(Arrays.asList(array2));

        for (String item : array1Items) {
            if (array2Items.contains(item))
                commonItems.add(item);
        }
        String[] returnString = new String[commonItems.size()];
        returnString = commonItems.toArray(returnString);
        return returnString;
    }
}