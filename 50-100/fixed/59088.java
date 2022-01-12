private void calculateFitness() {
    fitness = 0.0;
    int i = 0;
    for (java.lang.Integer g : genotype) {
        fitness += (java.lang.Math.pow(((dataFlow.get(i)) + 1), correctionRate.get(g))) / (correctionCost.get(g));
        i++;
    }
}