public void addCiw1w2(double[][][] oiw1w2) {
    for (int i = 0; i <= (Bdd.CircularCounter.imax); i++) {
        for (int w1 = 0; w1 < 4; w1++) {
            for (int w2 = 0; w2 < 4; w2++) {
                oiw1w2[i][w1][w2] += (3 * (ciw1w2[i][w1][w2])) / (geneLength);
            }
        }
    }
}