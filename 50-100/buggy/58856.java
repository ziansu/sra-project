public synchronized java.util.List<java.lang.String> listUnmanagedDrillits() {
    java.util.List<java.lang.String> drillbits = new java.util.ArrayList<>();
    for (org.apache.drill.yarn.zk.ZKRegistry.DrillbitTracker item : registry.values()) {
        if ((item.state) == (org.apache.drill.yarn.zk.ZKRegistry.DrillbitTracker.State.UNMANAGED)) {
            drillbits.add(toKey(item.endpoint));
        }
    }
    return drillbits;
}