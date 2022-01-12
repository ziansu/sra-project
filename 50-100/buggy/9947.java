@java.lang.Override
public java.util.Optional<java.lang.String> start(de.chrthms.hmatic4j.event.client.HMEventExecution execution) {
    this.execution = execution;
    de.chrthms.hmatic4j.event.core.HMEventRegistry registry = de.chrthms.hmatic4j.event.core.impl.HMEventRegistryImpl.getInstance();
    registryId = registry.register(this);
    if (onceOnly) {
        return java.util.Optional.of(registryId);
    }
    return java.util.Optional.empty();
}