public double[][] generateMat(int size) {
    double[][] myMat = new double[size][size];
    for (int i = 0; i < (myMat.length); i++) {
        for (int j = 0; j < (myMat[0].length); j++) {
            myMat[i][j] = java.lang.Math.random();
        }
    }
    return myMat;
}