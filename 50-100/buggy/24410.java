private void fillEmptyRows(int rowTo, int rowFrom) {
    for (; rowTo <= rowFrom; rowTo++) {
        for (int i = 0; i < (WIDTH); i++) {
            grid[i][rowTo] = false;
        }
        widthOfRows[rowTo] = 0;
    }
}