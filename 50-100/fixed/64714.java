private int partition(int[] a, int p, int r) {
    int x = a[r];
    int i = p - 1;
    for (int j = p; j <= (r - 1); j++) {
        if ((a[j]) <= x) {
            i++;
            arraySwap(a, i, j);
        }
    }
    arraySwap(a, (i + 1), r);
    return i + 1;
}