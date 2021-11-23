public static void sort(java.lang.Comparable[] a, java.lang.Comparable[] aux, int low, int high) {
    if (high <= low)
        return ;
    
    int mid = low + ((high - low) / 2);
    Algorithms.Sorting.MergeSort.sort(a, aux, low, mid);
    Algorithms.Sorting.MergeSort.sort(a, aux, (mid + 1), high);
    Algorithms.Sorting.MergeSort.merge(a, aux, low, high, mid);
}