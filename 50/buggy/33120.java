protected void start() {
    prepareEnvironment();
    executionMonitor.runSim(environmentInterface.getSettings().getExecutionSettings().runThreadded);
    initializeProcessingElements();
    prepareEnvironment();
    simulationEngine.initialize();
    executionMonitor.runSim(false);
}