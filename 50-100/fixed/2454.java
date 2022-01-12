private int boxCheckHelper(int[][] grid, int row, int col) {
    int[] freq = new int[10];
    for (int i = row; i < (row + 3); i++) {
        for (int j = col; j < (col + 3); j++) {
            (freq[grid[i][j]])++;
        }
    }
    return freqChecker(freq);
}