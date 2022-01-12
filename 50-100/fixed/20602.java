private void startGeofencing() {
    geofenceManager = com.gophillygo.explorer.services.GeofenceManager.getInstance();
    if (!(com.gophillygo.explorer.services.GeofenceManager.isRunning())) {
        geofenceManager.startService(this);
    }else {
        android.util.Log.d("MapActivity", "Geofence manager is already running");
    }
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        return ;
    }
    mMap.setMyLocationEnabled(true);
}