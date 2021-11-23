private static void insertionSort(java.lang.Comparable[] a, int lo, int hi) {
    for (int i = lo + 1; i <= hi; i++)
        for (int j = i; (j > lo) && (Sortings.Merge.less(a[j], a[(j - 1)])); j--)
            Sortings.Merge.exch(a, j, (j - 1));
        
    
}