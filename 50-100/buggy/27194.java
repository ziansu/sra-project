public void init() {
    this.mapFact = new engineModules.MapFactory();
    this.map = mapFact.getInitialMap();
    this.popFact = new engineModules.PopulationFactory(this);
    this.population = popFact.getInitialPopulation();
    this.spawner = new engineModules.EntitySpawner(population, this);
    this.distributor = new engineModules.EntityDistributor(map, this);
    distributePopulation();
    domain.SimulationParameters.getInstance().revertToDefaultSettings();
}