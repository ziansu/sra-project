public void fetchLocation() {
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        android.support.v4.app.ActivityCompat.requestPermissions(((android.app.Activity) (mContext)), new java.lang.String[]{ Manifest.permission.ACCESS_COARSE_LOCATION }, Constants.LOCATION_PERMISSION_REQUEST);
        return ;
    }
    LocationServices.FusedLocationApi.requestLocationUpdates(mApiClient, mLocationRequest, mLocationListener);
}