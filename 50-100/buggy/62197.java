private void computeStats(de.prob.statespace.Trace trace) {
    if (trace != null) {
        final de.prob.animator.command.ComputeStateSpaceStatsCommand stateSpaceStatsCmd = new de.prob.animator.command.ComputeStateSpaceStatsCommand();
        trace.getStateSpace().execute(stateSpaceStatsCmd);
        updateSimpleStats(stateSpaceStatsCmd.getResult());
        if (extendedStatsToggle.isSelected()) {
            final de.prob.animator.command.ComputeCoverageCommand coverageCmd = new de.prob.animator.command.ComputeCoverageCommand();
            trace.getStateSpace().execute(coverageCmd);
            updatExtendedStats(coverageCmd.getResult());
        }
    }else {
        noStatsLabel.setVisible(true);
    }
}