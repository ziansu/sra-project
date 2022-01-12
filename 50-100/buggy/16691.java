public static void main(java.lang.String[] args) {
    thewaypointers.trafficsimulator.common.helpers.SimpleWorldStateProvider simulation = new thewaypointers.trafficsimulator.common.helpers.SimpleWorldStateProvider();
    thewaypointers.trafficsimulator.gui.MainFrame mainFrame = new thewaypointers.trafficsimulator.gui.MainFrame(simulation.getNextState(0));
    while (true) {
        thewaypointers.trafficsimulator.common.WorldStateDTO newWorldState = simulation.getNextState(thewaypointers.trafficsimulator.FirstVersionStarter.VEHICLE_MOVEMENT_SPEED);
        MainFrame.mapContainerPanel.mapPanel.NewStateReceived(newWorldState);
        try {
            java.lang.Thread.sleep(((long) ((1.0F / (thewaypointers.trafficsimulator.FirstVersionStarter.STATES_PER_SECOND)) * 1000)));
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}