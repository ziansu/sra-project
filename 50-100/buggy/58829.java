protected void sort(java.lang.Comparable[] a, int low, int high) {
    if (low >= high)
        return ;
    
    int mid = low + ((high - low) / 2);
    sort(a, low, mid);
    sort(a, (mid + 1), high);
    if (mid <= (mid + 1))
        return ;
    
    merge(a, low, mid, high);
}