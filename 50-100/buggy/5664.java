private static void sort(java.lang.Comparable[] a, java.lang.Comparable[] aux, int lo, int hi) {
    int mid = lo + ((hi - lo) / 2);
    com.jaichaudhary.algorithms.sort.MergeSort.sort(a, aux, mid, hi);
    com.jaichaudhary.algorithms.sort.MergeSort.sort(a, aux, lo, mid);
    com.jaichaudhary.algorithms.sort.MergeSort.merge(a, aux, lo, mid, hi);
}