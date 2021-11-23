private int[][] generateInitialPopulation(int populationSize, int bitArrayLength) {
    int[][] initialPopulation = new int[populationSize][bitArrayLength + 1];
    for (int i = 0; i < populationSize; i++) {
        for (int j = 0; j < bitArrayLength; j++) {
            initialPopulation[i][j] = ((int) (java.lang.Math.round(java.lang.Math.random())));
        }
    }
    return initialPopulation;
}