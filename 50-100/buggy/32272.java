private static boolean isSorted(java.lang.Comparable[] a, int lo, int hi) {
    for (int i = lo; i < hi; i++) {
        if (!(QuickSort3way.less(a[i], a[(i + 1)])))
            return false;
        
    }
    return true;
}