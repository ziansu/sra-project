public static double[][] generateBlankTestData(int size) {
    double[][] data = new double[size][size];
    for (int x = 0; x < (data.length); x++) {
        for (int y = 0; y < (data[0].length); y++) {
            data[x][y] = 1.0;
        }
    }
    return data;
}