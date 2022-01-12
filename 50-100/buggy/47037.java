public int calculateFitness() {
    this.totalFitness = 0;
    for (int i = 0; i < (populationSize); i++) {
        this.totalFitness += currentPopulation.get(i).calculateFitness();
    }
    java.util.Collections.sort(currentPopulation);
    for (pszt_scheduling.Population.Individual i : currentPopulation)
        java.lang.System.out.println(("fitness " + (i.getFitnessValue())));
    
    return this.totalFitness;
}