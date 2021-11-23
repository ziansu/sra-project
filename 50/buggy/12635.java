public java.util.Collection<de.thjom.java.systemd.Unit> getMonitoredUnits() {
    return java.util.Collections.synchronizedCollection(monitoredUnits.values());
}