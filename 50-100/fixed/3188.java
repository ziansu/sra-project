public static void sort(java.lang.Comparable[] a) {
    for (int i = 0; i < (a.length); i++) {
        for (int j = i; (j > 0) && (com.jaichaudhary.algorithms.sort.InsertionSort.less(a[j], a[(j - 1)])); j--) {
            com.jaichaudhary.algorithms.sort.InsertionSort.exch(a, j, (j - 1));
        }
    }
}