public com.romio.locationtest.tracking.LocationManager getLocationManager() {
    if ((locationManager) != null) {
        locationManager = new com.romio.locationtest.tracking.LocationManagerImpl(this);
    }
    return locationManager;
}