private void setMode(java.lang.Boolean isActive) {
    if (isActive) {
        locationManager.removeUpdates(this);
        locationManager.requestLocationUpdates(getBestProvider(), 1000, 0, this);
    }else {
        locationManager.removeUpdates(this);
        locationManager.requestLocationUpdates(getBestProvider(), 300000, 100, this);
    }
}