private int[][] getRandomCenters(int k, int len) {
    java.util.Random generator = new java.util.Random(csd.auth.ftw.KMeansMapper.RAND_SEED);
    int[][] randCenters = new int[k][len];
    for (int i = 0; i < k; i++) {
        for (int j = 0; j < len; j++) {
            randCenters[i][j] = generator.nextInt(2);
        }
    }
    return randCenters;
}