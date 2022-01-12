public double evaluate() {
    double maxFitness = java.lang.Integer.MIN_VALUE;
    resetIndex();
    while (hasNext()) {
        Individual individual = next();
        java.lang.Double fitness = -(java.lang.Double.MAX_VALUE);
        fitness = evaluateIndividual(individual);
        if (fitness > maxFitness) {
            maxFitness = fitness;
        }
        individual.setFitness(fitness);
    } 
    return maxFitness;
}