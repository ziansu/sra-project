@java.lang.Override
public void run() {
    try {
        updateHost(resourceHostInfo);
    } catch (java.lang.Exception e) {
        io.subutai.core.hostregistry.impl.HostRegistryImpl.LOG.error(java.lang.String.format("Error checking host %s", resourceHostInfo), e);
    }
}