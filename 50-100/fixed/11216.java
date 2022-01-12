private int[] quicksort(int[] list, int low, int high) {
    if (low >= high)
        return list;
    
    int pos = partition(list, low, high);
    quicksort(list, low, (pos - 1));
    quicksort(list, (pos + 1), high);
    return list;
}