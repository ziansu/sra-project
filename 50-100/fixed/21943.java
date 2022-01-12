@javafx.fxml.FXML
public void startSimulation() {
    if ((this.simulator) != null) {
        new java.lang.Thread(this.simulator).start();
        java.lang.Thread t = new java.lang.Thread(() -> {
            new railview.simulation.SimulationController.SimulationUpdater().periodicalUpdate(false);
        });
        t.setDaemon(true);
        t.start();
    }
}