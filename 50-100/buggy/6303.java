public static void sort(java.lang.Comparable[] a, java.lang.Comparable[] aux, int low, int high) {
    int mid = low + ((high - low) / 2);
    if (high <= low)
        return ;
    
    Algorithms.Sorting.MergeSort.sort(a, aux, low, mid);
    Algorithms.Sorting.MergeSort.sort(a, aux, (mid + 1), high);
    Algorithms.Sorting.MergeSort.merge(a, aux, low, high, mid);
}