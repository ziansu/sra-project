public void destroyContainer(io.subutai.core.environment.impl.adapter.ProxyEnvironment env, java.lang.String containerId) {
    try {
        io.subutai.common.peer.EnvironmentContainerHost ch = env.getContainerHostById(containerId);
        ((io.subutai.core.environment.impl.entity.EnvironmentContainerImpl) (ch)).destroy();
        hubAdapter.destroyContainer(env.getId(), ch.getHostname());
    } catch (java.lang.Exception e) {
        log.error("Error to destroy container: ", e);
    }
}