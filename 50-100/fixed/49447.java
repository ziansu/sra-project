private static Individual findFittest(double fit) {
    Individual fittestIndividual = new Individual();
    for (Individual i : Driver.oldPopulation) {
        if ((i.getFitness()) > fit) {
            fit = i.getFitness();
            Driver.fittest = i;
        }
    }
    return fittestIndividual;
}