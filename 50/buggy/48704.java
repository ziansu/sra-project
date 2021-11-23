public void updatePipe(de.robotricker.transportpipes.pipes.types.Pipe pipe) {
    for (de.robotricker.transportpipes.rendersystem.PipeRenderSystem pm : TransportPipes.instance.getPipeRenderSystems()) {
        pm.updatePipeASD(pipe);
    }
    pipe.notifyConnectionsChange();
}