private static void sort(java.lang.Comparable[] arr, int left, int right) {
    int mid = com.danny.datastruct.sort.QuickSort.adjustArray(arr, left, right);
    com.danny.datastruct.sort.QuickSort.sort(arr, left, (mid - 1));
    com.danny.datastruct.sort.QuickSort.sort(arr, (mid + 1), right);
}