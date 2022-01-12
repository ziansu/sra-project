private void drillbitRegistered(org.apache.drill.exec.proto.CoordinationProtos.DrillbitEndpoint dbe) {
    java.lang.String key = toKey(dbe);
    org.apache.drill.yarn.zk.ZKRegistry.DrillbitTracker tracker = registry.get(key);
    if (tracker == null) {
        org.apache.drill.yarn.zk.ZKRegistry.LOG.info(("Registration of unmanaged drillbit: " + key));
        tracker = new org.apache.drill.yarn.zk.ZKRegistry.DrillbitTracker(key);
        tracker.endpoint = dbe;
        registry.put(key, tracker);
        return ;
    }
    if ((tracker.state) == (org.apache.drill.yarn.zk.ZKRegistry.DrillbitTracker.State.REGISTERED)) {
        return ;
    }
    tracker.endpoint = dbe;
    tracker.becomeRegistered(controller);
}