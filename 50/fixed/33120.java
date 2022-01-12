protected void start() {
    prepareEnvironment();
    executionMonitor.runSim(environmentInterface.getSettings().getExecutionSettings().runThreadded);
}