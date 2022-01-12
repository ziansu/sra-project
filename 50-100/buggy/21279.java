private void findLocation() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        mLocationManager = ((android.location.LocationManager) (this.getSystemService(Context.LOCATION_SERVICE)));
        mLocationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, this);
    }
}