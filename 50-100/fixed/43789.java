public double evaluate() {
    double maxFitness = java.lang.Integer.MIN_VALUE;
    resetIndex();
    while (hasNext()) {
        Individual individual = next();
        java.lang.Double fitness;
        fitness = evaluateIndividual(individual);
        if (fitness > maxFitness) {
            maxFitness = fitness;
        }
        individual.setFitness(fitness);
    } 
    return maxFitness;
}