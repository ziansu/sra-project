@java.lang.Override
public void executePhase(at.borkowski.scovillej.simulation.SimulationContext context) {
    try {
        socketProcessor.executePhase(context);
        if (socketProcessor.isReady())
            return ;
        
        clientCodeProcessor.executePhase(context);
        fetchProcessor.executePhase(context);
    } catch (java.lang.Exception ex) {
        throw new java.lang.RuntimeException(ex);
    }
}