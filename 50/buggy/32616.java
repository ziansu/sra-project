public static void heapify(int[] arr) {
    for (int i = 0; i < (arr.length); i++) {
        HeapSort.pushDown(arr, i);
    }
}