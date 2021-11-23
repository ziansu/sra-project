public static boolean isComplete(int[][] grid) {
    if ((SudokuValidity.nextEmptyCase(grid).i) == (-1)) {
        return true;
    }
    return false;
}