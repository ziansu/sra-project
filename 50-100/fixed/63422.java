@java.lang.Override
public io.cattle.platform.engine.handler.HandlerResult handle(final io.cattle.platform.engine.process.ProcessState state, io.cattle.platform.engine.process.ProcessInstance process) {
    final io.cattle.platform.core.model.Host host = ((io.cattle.platform.core.model.Host) (state.getResource()));
    io.cattle.platform.core.model.Agent agent = objectManager.loadResource(io.cattle.platform.core.model.Agent.class, host.getAgentId());
    if (agent == null) {
        return null;
    }
    removeInstances(host);
    return null;
}