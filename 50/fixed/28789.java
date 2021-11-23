private boolean isLocationEnabled() {
    return mLocationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
}