public static void quickSort(int[] a) {
    QuickSort.helper = new int[a.length];
    QuickSort.qsort(a, 0, ((a.length) - 1));
}