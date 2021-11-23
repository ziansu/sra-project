private boolean checkLocationPermission() {
    java.lang.String[] permissions = new java.lang.String[]{ android.Manifest.permission.ACCESS_FINE_LOCATION };
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, permissions, com.world.bolandian.whereareyou.MapsActivity.RC_LOCATION);
        return false;
    }
    return true;
}