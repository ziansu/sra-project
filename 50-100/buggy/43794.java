public static int min(int[] array, int start, int end) {
    int min = array[start];
    int minIndex = start;
    for (int i = start + 1; i < end; i++) {
        if ((array[i]) < min) {
            min = array[i];
            minIndex = i;
        }
    }
    return minIndex;
}