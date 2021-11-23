public boolean start() {
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        return false;
    }
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, (1000 * 1), 1, locationListener);
    checkEnabled();
    return true;
}