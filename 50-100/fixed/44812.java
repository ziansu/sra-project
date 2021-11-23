public void updateSettings() {
    sensorCount = wsnFrame.getSensorCount();
    sensingRange = wsnFrame.getSensingRange();
    communicationRange = wsnFrame.getCommunicationRange();
    detectionThreshold = wsnFrame.getDetectionThreshold();
    RunSim.mouseAlgorithmType = wsnFrame.getAlgorithmType();
    RunSim.detectionAlgorithm = wsnFrame.getDetectionType();
    RunSim.maxIterations = wsnFrame.getIterationsNum();
    w = wsnFrame.getFieldWidth();
    h = wsnFrame.getFieldHeight();
    restartSimulation(true);
}