public java.lang.Comparable select(java.lang.Comparable[] a, int k) {
    edu.princeton.cs.algs4.StdRandom.shuffle(a);
    int lo = 0;
    int high = (a.length) - 1;
    while (high > lo) {
        int j = Sort.QuickSort.partition(a, lo, high);
        if (j == k)
            break;
        
        if (j > k)
            high = j - 1;
        
        if (j < k)
            lo = j + 1;
        
    } 
    return a[k];
}