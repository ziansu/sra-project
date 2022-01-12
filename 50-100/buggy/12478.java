public void generateFirstGeneration() {
    genomes = new float[genomesPerGeneration][(numPlanets) * (paramsPerPlanet)];
    for (int i = 0; i < (genomesPerGeneration); i++)
        genomes[i] = generateRandomGenome();
    
    generationCounter = 1;
    com.github.infosimulators.events.EventRegistry.fire(new com.github.infosimulators.events.Event(com.github.infosimulators.events.EventType.TRAINER_GENERATED_FIRST_GEN, null));
    com.github.infosimulators.events.EventRegistry.fire(new com.github.infosimulators.events.Event(com.github.infosimulators.events.EventType.TRAINER_GEN_GENERATED, new java.lang.String[]{ "1" }));
}