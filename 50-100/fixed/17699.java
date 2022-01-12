public static int findMin(int[] arr, int startIndex) {
    int min = startIndex;
    for (int i = startIndex + 1; i < (arr.length); i++) {
        if ((arr[i]) < (arr[min])) {
            java.lang.System.out.println(arr[i]);
            min = i;
        }
    }
    return min;
}