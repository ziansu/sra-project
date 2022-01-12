private levelGenerators.jaspGeneticLevelGenerator.Individual selectIndividual() {
    levelGenerators.jaspGeneticLevelGenerator.Individual individualToReturn = null;
    double[] probabilities = getProbabilities();
    double rouletteNumber = random.nextDouble();
    for (int i = 0; i < (populationSize); i++) {
        if ((probabilities[i]) < rouletteNumber) {
            individualToReturn = population.get(i);
            break;
        }
    }
    return individualToReturn;
}