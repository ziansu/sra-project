private void runGeneticAlgorithm(int iterations) {
    for (int i = 0; i < iterations; i++) {
        java.lang.System.out.println(("iteration: " + iterations));
        generateNewPopulation(selection_mode, crossover_mode, mutation_mode);
    }
    evaluatePopulation();
    int i = 0;
    for (Genome g : currentpopulation) {
        i++;
        if ((g.getFitness()) > 0) {
            java.lang.System.out.println(((i + " fitness:") + (g.getFitness())));
        }
    }
}