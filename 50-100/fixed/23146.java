public static void selectionSort(java.lang.Comparable[] array) {
    for (int i = 0; i < (array.length); i++) {
        int min = i;
        for (int j = i + 1; j < (array.length); j++) {
            if ((array[j].compareTo(array[min])) < 0) {
                min = j;
            }
        }
        com.petrez.algorithms.Sorting.exchange(array, i, min);
    }
}