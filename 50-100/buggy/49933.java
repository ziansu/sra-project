public static void main(java.lang.String[] args) {
    thewaypointers.trafficsimulator.simulation.Simulation simulation = new thewaypointers.trafficsimulator.simulation.Simulation();
    thewaypointers.trafficsimulator.TrafficSimulatorStarter.mainFrame = new thewaypointers.trafficsimulator.gui.MainFrame();
    while (true) {
        try {
            java.lang.Thread.sleep(thewaypointers.trafficsimulator.TrafficSimulatorStarter.TIME_STEP);
            thewaypointers.trafficsimulator.TrafficSimulatorStarter.worldState = simulation.getNextSimulationStep(thewaypointers.trafficsimulator.TrafficSimulatorStarter.SIMULATION_TIME_STEP);
            MainFrame.mapContainerPanel.mapPanel.NewStateReceived(thewaypointers.trafficsimulator.TrafficSimulatorStarter.worldState);
        } catch (java.lang.InterruptedException ex) {
            java.lang.System.out.println(ex.getMessage());
        }
    } 
}