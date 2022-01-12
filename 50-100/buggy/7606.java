@java.lang.Override
public com.lukgru.galgo.runner.GenerationResult<T> generate() {
    com.lukgru.galgo.model.Population<T> population = initialPopulation;
    int iteration = 0;
    do {
        com.lukgru.galgo.model.Population<T> selectedForReproduction = selection(population, fitnessFunction);
        com.lukgru.galgo.model.Population<T> newPopulation = reproduce(selectedForReproduction, crossoverFunction);
        mutate(newPopulation);
        population = newPopulation;
        iteration++;
    } while (!(solutionFound(population, fitnessFunction)) );
    return new com.lukgru.galgo.runner.GenerationResult(population, iteration);
}