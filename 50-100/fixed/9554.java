public void checkNeededInColumn() {
    int n;
    for (int j = 0; j < 9; j++) {
        for (int i = 1; i < 10; i++) {
            if (de.halemba.helpers.SolveHelper.checkMissingInColumn(i, j, grid)) {
                n = de.halemba.helpers.SolveHelper.checkSinglePossiblityColumn(i, j, grid);
                if (n >= 0) {
                    grid[n][j].setNumber(i);
                    break;
                }
            }
        }
    }
}