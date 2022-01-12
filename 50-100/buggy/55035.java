public void checkNeededInRow() {
    int n;
    for (int j = 0; j < 9; j++) {
        for (int i = 1; i < 10; i++) {
            if (de.halemba.helpers.SolveHelper.checkMissingInRow(i, j, grid)) {
                n = de.halemba.helpers.SolveHelper.checkSinglePossiblityRow(i, j, grid);
                if (n >= 0) {
                    grid[j][n].setNumber(i);
                }
            }
        }
    }
}