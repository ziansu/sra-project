private void startTracking() {
    java.lang.String requiredPermission = Manifest.permission.ACCESS_FINE_LOCATION;
    int permissionState = android.support.v4.content.ContextCompat.checkSelfPermission(this, requiredPermission);
    if (permissionState != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ requiredPermission }, 1);
    }
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
}