private void cancelLocationUpdates() {
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        return ;
    }
    if ((googleApiClient) != null)
        googleApiClient.disconnect();
    
    if (((locationManager) != null) && ((locationListener) != null))
        locationManager.removeUpdates(locationListener);
    
}