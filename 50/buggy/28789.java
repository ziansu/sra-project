private boolean isLocationEnabled() {
    return (mLocationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) || (mLocationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER));
}