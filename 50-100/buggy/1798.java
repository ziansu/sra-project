private void loadLocation() {
    android.location.LocationManager locationManager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    if ((!(locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))) && (!(locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)))) {
        buildAlertMessageNoGps();
    }
    currentLocation = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
    updateControlSetLocation(currentLocation);
}