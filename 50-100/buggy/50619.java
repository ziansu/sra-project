public static <T extends java.lang.Comparable<T>> void sort(T[] array) {
    boolean sorted = false;
    while (!sorted) {
        sorted = com.growingwiththeweb.sorting.OddEvenSort.innerSort(array, 1);
        sorted = sorted && (com.growingwiththeweb.sorting.OddEvenSort.innerSort(array, 0));
    } 
}