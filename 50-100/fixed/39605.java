@java.lang.Override
public void sort(adt.interfaces.AdtArray array) {
    if (array != null) {
        for (int i = 0; i <= ((array.length()) - 1); i++) {
            int minIndex = sort.SelectionSort.findMinStartingAt(i, array);
            sort.SelectionSort.swap(array, i, minIndex);
        }
    }
}