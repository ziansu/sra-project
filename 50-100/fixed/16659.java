private static boolean isSorted(java.lang.Object[] a, int lo, int hi, java.util.Comparator comparator) {
    for (int i = lo + 1; i < hi; i++)
        if (edu.princeton.cs.algs4.Insertion.less(a[i], a[(i - 1)], comparator))
            return false;
        
    
    return true;
}