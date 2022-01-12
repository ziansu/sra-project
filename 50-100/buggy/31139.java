public static void quicksort(int[] arr, int s, int e) {
    if (s >= e)
        return ;
    
    int pivot = quickselect.part(arr, s, e);
    quickselect.quicksort(a, s, (pivot - 1));
    quickselect.quicksort(a, s, (pivot + 1));
}