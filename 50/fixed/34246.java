private void stopUsingGPS() {
    if ((locationManager) != null) {
        locationManager.removeUpdates(this);
    }
}