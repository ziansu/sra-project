private static boolean isSorted(java.lang.Comparable[] a, int lo, int hi) {
    for (int i = lo; i < hi; i++) {
        if (QuickSort3way.less(a[(i + 1)], a[i]))
            return false;
        
    }
    return true;
}