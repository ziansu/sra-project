void mergeSort(int[] a, int[] p, int[] c, int l, int r) {
    int range = r - l;
    if (range > 0) {
        int m = l + (range / 2);
        mergeSort(a, p, c, l, m);
        mergeSort(a, p, c, (m + 1), r);
        merge(a, p, c, l, r);
    }
}