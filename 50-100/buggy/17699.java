public static int findMin(int[] arr, int startIndex) {
    int min = startIndex;
    for (int i = startIndex + 1; i < ((arr.length) - 1); i++) {
        if ((arr[i]) < (arr[min])) {
            min = i;
        }
    }
    return min;
}