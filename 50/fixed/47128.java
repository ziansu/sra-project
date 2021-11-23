private static void swap(int[] arr, int i, int min) {
    int tmp = arr[i];
    arr[i] = arr[min];
    arr[min] = tmp;
}