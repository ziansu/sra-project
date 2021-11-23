public static void mergeSort(int[] a, int p, int r) {
    if (p < r) {
        int q = (p + r) / 2;
        Sorting.MergeSort.mergeSort(a, p, q);
        Sorting.MergeSort.mergeSort(a, (q + 1), r);
        Sorting.MergeSort.merge(a, p, q, r);
    }
}