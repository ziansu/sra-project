public void createPipe(de.robotricker.transportpipes.pipes.types.Pipe pipe, java.util.Collection<de.robotricker.transportpipes.pipes.PipeDirection> allConnections) {
    for (de.robotricker.transportpipes.rendersystem.PipeRenderSystem pm : TransportPipes.instance.getPipeRenderSystems()) {
        pm.createPipeASD(pipe, allConnections);
    }
    pipe.notifyConnectionsChange();
}