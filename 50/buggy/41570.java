@org.junit.Test
public void should_work() {
    fr.seb.games.geneticcar.simulation.Simulation simulation = new fr.seb.games.geneticcar.simulation.Simulation();
    simulation.buildGenerationZero();
    simulation.runSimulation();
    simulation.showAllScores();
}