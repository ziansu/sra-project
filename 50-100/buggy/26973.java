private int[][] getRandomCenters(int len) {
    java.util.Random generator = new java.util.Random(csd.auth.ftw.KMeansMapper.RAND_SEED);
    int[][] randCenters = new int[csd.auth.ftw.KMeansMapper.K][len];
    for (int i = 0; i < (csd.auth.ftw.KMeansMapper.K); i++) {
        for (int j = 0; j < len; j++) {
            randCenters[i][j] = generator.nextInt(2);
        }
    }
    return randCenters;
}