public void executePhase(at.borkowski.scovillej.simulation.SimulationContext context) throws java.io.IOException {
    if (!(initialized))
        initialize(context);
    
    if ((serverSocket.available()) > 0)
        owner.registerClientProcessor(new at.borkowski.scovillej.prefetch.members.server.ClientProcessor(owner, serverSocket.accept()));
    
}