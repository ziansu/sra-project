private static javafx.animation.ParallelTransition createDynamicAtTimeStep(java.lang.Double timeStep, tum.cms.sim.momentum.visualization.controller.CoreController coreController, tum.cms.sim.momentum.utility.csvData.reader.SimulationOutputReader simulationOutputReader) throws java.lang.Exception {
    tum.cms.sim.momentum.utility.csvData.reader.SimulationOutputCluster dataStepCurrent = null;
    while (dataStepCurrent == null) {
        dataStepCurrent = simulationOutputReader.asyncReadDataSet(timeStep);
        if (dataStepCurrent == null) {
            java.lang.Thread.sleep(200);
        }
    } 
    return tum.cms.sim.momentum.visualization.utility.AnimationCalculations.updateCustomData(simulationOutputReader.getCsvType(), dataStepCurrent, coreController);
}