public static int[] sort(int[] arr) {
    for (int i = 0; i < (arr.length); i++) {
        int min = com.shekhargulati.tadm.ch04.examples.SelectionSort.findMinIndex(arr, i);
        com.shekhargulati.tadm.ch04.examples.SelectionSort.swap(arr, arr[i], min);
    }
    return arr;
}