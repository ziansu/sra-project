public java.lang.Integer[] generateRandomSolution() {
    int[][] uniformProbability = new int[pavlik.john.Genetic.instance.adjacencyMatrix.length][pavlik.john.Genetic.instance.adjacencyMatrix.length];
    for (int i = 0; i < (uniformProbability.length); ++i) {
        for (int j = 0; j < (uniformProbability[i].length); ++i) {
            uniformProbability[i][j] = 1;
        }
    }
    return generateRouteSolution(uniformProbability);
}