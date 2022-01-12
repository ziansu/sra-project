public static void sort(java.lang.Comparable[] a, int lo, int hi) {
    for (int i = lo; i <= hi; i++) {
        for (int j = i; (j > lo) && (edu.princeton.cs.algs4.Insertion.less(a[j], a[(j - 1)])); j--) {
            edu.princeton.cs.algs4.Insertion.exch(a, j, (j - 1));
        }
    }
    assert edu.princeton.cs.algs4.Insertion.isSorted(a, lo, hi);
}