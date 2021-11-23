public void sortArray(int[] arr, int left, int right) throws java.lang.NullPointerException {
    int temp = partition(arr, left, right);
    if (left < (temp - 1)) {
        sortArray(arr, left, (temp - 1));
    }
    if (temp < right) {
        sortArray(arr, temp, right);
    }
}