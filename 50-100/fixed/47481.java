void cropDomainsAtRow(int r, int v, boolean[][][] domain) {
    for (int c = 0; c < (sudoku.Grid.size); c++) {
        domain[r][c][v] = false;
    }
}