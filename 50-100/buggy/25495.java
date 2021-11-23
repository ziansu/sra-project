private static void shift(int[] array, int start, int end) {
    int temp = array[start];
    for (int i = start + 1; i < end; i++) {
        if (i == (start + 1)) {
            array[i] = array[(i - 1)];
        }else {
            array[i] = temp;
        }
    }
}