public Visualisation.Map initialize() {
    addFloors();
    addWalls();
    addDoors();
    this.graphMap = cellMap.createAndGetGraphMap();
    int agentNumber = Visualisation.RandomGenerator.getInstance().uniformInt(1, maxAgentsNumber);
    addAgents(1);
    return cellMap;
}