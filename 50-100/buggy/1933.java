private void mergeSort(int[] arr, int low, int high) {
    if ((high - low) < (com.naptex.study.dsa.sort.MergeSort.INSERTIONSORT_THRESHOLD)) {
        insertionSort(arr);
        return ;
    }
    int mid = low + ((high - low) / 2);
    mergeSort(arr, low, mid);
    mergeSort(arr, (mid + 1), high);
    merge(arr, low, high, mid);
}