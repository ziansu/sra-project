public void removeDriver(long driverId) throws java.sql.SQLException {
    dataManager.removeAttribute(driverId);
    if (drivers.containsKey(driverId)) {
        java.lang.String driverUniqueId = drivers.get(driverId).getUniqueId();
        drivers.remove(driverId);
        driversByUniqueId.remove(driverUniqueId);
    }
    refreshUserDrivers();
    refresh();
}