@java.lang.Override
public void update(simulation.Simulator simulator) {
    if (simulator == null)
        this.simulator = simulator;
    
    preys = ((simulation.environment.CooperativeForagingEnvironment) (simulator.getEnvironment())).getNumberOfPreys();
    teamSize = simulator.getRobots().size();
    preysCaptured = ((simulation.environment.CooperativeForagingEnvironment) (simulator.getEnvironment())).getNumberOfFoodSuccessfullyForaged();
}