@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.util.Log.i(com.valevich.stormy.location.LocationProvider.TAG, "Location services connected.");
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        return ;
    }
    android.location.Location location = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    if (location == null) {
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    }else {
        mLocationCallback.handleNewLocation(location);
    }
}