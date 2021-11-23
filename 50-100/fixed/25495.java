private static void shift(int[] array, int start, int end) {
    int temp = array[start];
    for (int i = end - 1; i > start; i--) {
        array[i] = array[(i - 1)];
    }
}