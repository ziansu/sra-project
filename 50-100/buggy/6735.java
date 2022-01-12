@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    mLocationRequest = new com.google.android.gms.location.LocationRequest();
    mLocationRequest.setInterval(10000);
    mLocationRequest.setFastestInterval(10000);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        return ;
    }
    LocationServices.FusedLocationApi.requestLocationUpdates(mclientAPI, mLocationRequest, this);
}