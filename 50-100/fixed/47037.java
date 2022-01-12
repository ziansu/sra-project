public int calculateFitness() {
    this.totalFitness = 0;
    for (int i = 0; i < (populationSize); i++) {
        this.totalFitness += currentPopulation.get(i).calculateFitness();
    }
    java.util.Collections.sort(currentPopulation);
    return this.totalFitness;
}