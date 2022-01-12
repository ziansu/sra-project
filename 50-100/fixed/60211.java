private static int calcularFitness(int[] individuo, int[][] MATRIZ_ADJACENTE) {
    int fitness = 0;
    for (int j = 0; j < ((individuo.length) - 1); j++) {
        fitness = fitness + (MATRIZ_ADJACENTE[individuo[j]][individuo[(j + 1)]]);
    }
    return fitness;
}