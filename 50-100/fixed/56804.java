protected void startLocationUpdates() {
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ android.Manifest.permission.ACCESS_FINE_LOCATION }, 1);
        return ;
    }
    LocationServices.FusedLocationApi.requestLocationUpdates(myGoogleClient, myLocationRequest, this);
}