@java.lang.Override
public void stopMonitor(java.lang.String uuid) {
    com.google.common.base.Preconditions.checkArgument(monitorRegistry.containsKey(uuid), java.lang.String.format("No monitor with id %s was registered", uuid));
    monitorRegistry.get(uuid).stop();
    monitorRegistry.remove(uuid);
}