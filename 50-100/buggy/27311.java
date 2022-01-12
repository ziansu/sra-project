public void execute() {
    uchicago.src.sim.util.SimUtilities.shuffle(agentList);
    for (int i = 0; i < (agentList.size()); i++) {
        RabbitsGrassSimulationAgent agnt = ((RabbitsGrassSimulationAgent) (agentList.get(i)));
        agnt.step();
    }
    removeDeadAgents();
    rbSpace.growGrass(grassGrowthRate, grassEnergy);
    displaySurface.updateDisplay();
}