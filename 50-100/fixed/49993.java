public void activateGPS() {
    locationManager = ((android.location.LocationManager) (context.getSystemService(Context.LOCATION_SERVICE)));
    if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 1, this);
    }else {
        setChanged();
        this.notifyObservers();
    }
}