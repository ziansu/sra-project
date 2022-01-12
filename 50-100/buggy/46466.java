private void checkLocationPermissions() {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        requestFineLocationPermission();
    }
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        requestCoarseLocationPermission();
    }
}