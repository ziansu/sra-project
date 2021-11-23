public synchronized void addSimulationObject(com.Andryyo.I.SimulationObject o) {
    currentStep.setObjectPosition(o, o.getPosition());
    predictSimulation();
}