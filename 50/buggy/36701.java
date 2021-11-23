public pt.uminho.ceb.biosystems.mew.solvers.SolverType getSimulationSolver() {
    java.lang.String tag = getProperty(pt.uminho.ceb.biosystems.mew.core.cmd.searchtools.configuration.SimulationConfiguration.SIM_SOLVER, currentState, true);
    if (tag != null)
        return pt.uminho.ceb.biosystems.mew.solvers.SolverType.valueOf(tag.toUpperCase());
    else
        return null;
    
}