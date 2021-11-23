private void connectSimModel(thesis.core.SimModel simModel) {
    uavViewPan.connectSimModel(simModel, simPanel);
    simTimer.connectSimRunner(simRunner);
    simPanel.connectSimModel(simModel, actions);
}