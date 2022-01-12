void mergeSort(int[] a, int[] p, int[] c, int l, int r) {
    if (l >= r) {
        return ;
    }
    int m = (l + r) / 2;
    mergeSort(a, p, c, l, m);
    mergeSort(a, p, c, (m + 1), r);
    merge(a, p, c, l, m, r);
}