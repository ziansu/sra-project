public synchronized boolean isRegistered(org.apache.drill.yarn.appMaster.Task task) {
    java.lang.String key = toKey(task);
    org.apache.drill.yarn.zk.ZKRegistry.DrillbitTracker tracker = registry.get(key);
    if (tracker == null) {
        return false;
    }
    return (tracker.state) == (org.apache.drill.yarn.zk.ZKRegistry.DrillbitTracker.State.REGISTERED);
}