@java.lang.Override
public double evaluate(pt.uminho.ceb.biosystems.mew.mewcore.simulation.components.SteadyStateSimulationResult simResult) {
    double sumFluxes = 0.0;
    if ((fluxesToSum) == null)
        fluxesToSum = new java.util.HashSet(simResult.getFluxValues().keySet());
    
    for (java.lang.String v : fluxesToSum)
        sumFluxes += java.lang.Math.abs(simResult.getFluxValues().getValue(v));
    
    if (maximize)
        return sumFluxes;
    else {
        if (sumFluxes <= 1)
            return 0;
        else
            return java.lang.Math.log10((1 / sumFluxes));
        
    }
}