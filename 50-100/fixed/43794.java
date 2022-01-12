public static int min(int[] array, int start, int end) {
    int minIndex = start;
    for (int i = start; i < end; i++) {
        if ((array[i]) < (array[minIndex])) {
            minIndex = i;
        }
    }
    return minIndex;
}