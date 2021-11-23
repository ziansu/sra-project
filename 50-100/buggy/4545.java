@java.lang.Override
public uk.co.cranfield.model.Results solve() {
    uk.co.cranfield.core.WaveSimulatorSolver.logger.info(("Preparing Bathymetry File : " + (uk.co.cranfield.common.Constants.SLOPE_RES_FILE)));
    prepareBathyMetryFile();
    uk.co.cranfield.core.WaveSimulatorSolver.logger.info(("Bathymetry File Created with file name : " + (uk.co.cranfield.common.Constants.SLOPE_RES_FILE)));
    uk.co.cranfield.core.WaveSimulatorSolver.logger.info("Time Stepping Started...");
    timeStepping(this.selector);
    uk.co.cranfield.core.WaveSimulatorSolver.logger.info("Time Stepping Finished.");
    return getResults();
}