private static javafx.animation.ParallelTransition createDynamicAtTimeStep(tum.cms.sim.momentum.utility.csvData.reader.SimulationOutputReader simulationOutputReader, java.lang.Double timeStep, tum.cms.sim.momentum.visualization.controller.CoreController coreController) throws java.lang.Exception {
    tum.cms.sim.momentum.utility.csvData.reader.SimulationOutputCluster dataStepCurrent = null;
    while (dataStepCurrent == null) {
        dataStepCurrent = simulationOutputReader.asyncReadDataSet(timeStep);
        if (dataStepCurrent == null) {
            java.lang.Thread.sleep(200);
        }
    } 
    return tum.cms.sim.momentum.visualization.utility.AnimationCalculations.updateCustomData(simulationOutputReader.getCsvType(), dataStepCurrent, coreController);
}