private void subscribeToLocationUpdates() {
    android.util.Log.d(it.faerb.herakles.LocationLoggerService.TAG, "subscribeToLocationUpdates: begin");
    android.location.LocationManager locationManager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        return ;
    }
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
    android.util.Log.d(it.faerb.herakles.LocationLoggerService.TAG, "subscribeToLocationUpdates: requested");
}