private static int[] calcularFitness(int[][] populacao, int[][] MATRIZ_ADJACENTE) {
    int[] fitness = new int[populacao.length];
    for (int i = 0; i < (populacao.length); i++) {
        fitness[i] = algoritmo.memetico.AlgoritmoMemetico.calcularFitness(populacao[i], MATRIZ_ADJACENTE);
    }
    return fitness;
}