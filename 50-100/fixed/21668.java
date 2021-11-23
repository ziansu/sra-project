public static boolean isSorted(int[] arr, int min, int max) {
    for (int i = min; i < (max - 1); i++) {
        if ((arr[i]) > (arr[(i + 1)])) {
            return false;
        }
    }
    return true;
}