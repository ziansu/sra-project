@javafx.fxml.FXML
public void replaySimulation() {
    if ((this.simulator) != null) {
        java.lang.Thread t = new java.lang.Thread(() -> {
            new railview.simulation.SimulationController.SimulationUpdater().periodicalUpdate();
        });
        t.setDaemon(true);
        t.start();
    }
}