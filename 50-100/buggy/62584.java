public static double[][] generateBlankTestData() {
    double[][] data = new double[10][10];
    for (int x = 0; x < 10; x++) {
        for (int y = 0; y < 10; y++) {
            data[x][y] = 1.0;
        }
    }
    return data;
}