private GeneticAlgorithm.FitnessAssessment findBestIndividual() {
    int bestIndex = 0;
    GeneticAlgorithm.FitnessAssessment bestFitness = assessFitness(population.get(0));
    for (int individual = 1; individual < (population.size()); individual++) {
        GeneticAlgorithm.FitnessAssessment fitness = assessFitness(population.get(individual));
        if ((fitness.compareTo(bestFitness)) > 0) {
            bestFitness = fitness;
            bestIndex = individual;
        }
    }
    return bestFitness;
}