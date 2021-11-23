public static boolean inBounds(int[][] array, int r, int c) {
    return ((r >= 0) && (r < (array.length))) && ((c >= 0) && (c < (array[r].length)));
}