public static void sort(double[] arr) {
    int len = arr.length;
    for (int i = 0; i < (len - 1); i++) {
        for (int j = 0; j < ((len - i) - 1); j++) {
            if ((arr[j]) > (arr[(j + 1)])) {
                BubbleSort.swap(arr, i, j);
            }
        }
    }
}