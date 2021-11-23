public void stopGeofenceMonitoring() {
    com.backendless.GeoFenceMonitoring geoFenceMonitoring = ((com.backendless.GeoFenceMonitoring) (com.backendless.LocationTracker.getInstance().getListener(GeoFenceMonitoring.NAME)));
    if (geoFenceMonitoring == null) {
        return ;
    }
    geoFenceMonitoring.removeGeoFences();
    com.backendless.LocationTracker.getInstance().removeListener(GeoFenceMonitoring.NAME);
}