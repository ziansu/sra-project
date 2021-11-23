private double[][] generateO(int rX, int rY) {
    double[][] o = new double[cols][rows];
    for (int i = 0; i < (cols); i++) {
        for (int j = 0; (j1) < (rows); j++) {
            o[i][j] = getOrXY(rX, rY, i, j);
        }
    }
}