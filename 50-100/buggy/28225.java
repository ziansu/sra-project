protected void startLocationUpdates() {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, 1);
    }
    LocationServices.FusedLocationApi.requestLocationUpdates(myGoogleClient, myLocationRequest, this);
}