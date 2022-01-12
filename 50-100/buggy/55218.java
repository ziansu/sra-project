private static int getIndex(int[][] array, int c) {
    for (int i = 0; i < (array.length); ++i) {
        if ((c >= (array[i][0])) && (c < (array[i][1]))) {
            return i;
        }
    }
    return -1;
}