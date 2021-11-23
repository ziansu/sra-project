private static boolean isSorted(java.lang.Comparable[] a, int lo, int hi) {
    for (int i = lo + 1; i < hi; i++)
        if (edu.princeton.cs.algs4.Insertion.less(a[i], a[(i - 1)]))
            return false;
        
    
    return true;
}