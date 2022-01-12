private static void mergeSort(int[] array, int p, int r) {
    if (p < r) {
        int q = ((r - p) / 2) + p;
        algorithms.sorting.Sorting.mergeSort(array, p, q);
        algorithms.sorting.Sorting.mergeSort(array, (q + 1), r);
        algorithms.sorting.Sorting.merge(array, p, q, r);
    }
}