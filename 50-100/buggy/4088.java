public void triggerLocationCheck() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.location.Location currentLocation = LocationServices.FusedLocationApi.getLastLocation(apiClient);
        scheduleLocationCheck(currentLocation, lastLocation);
    }else {
        android.content.Intent mainActivityIntent = new android.content.Intent(this, org.sircular.proxalert.ProxAlertActivity.class);
        this.startActivity(mainActivityIntent);
    }
}