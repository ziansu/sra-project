private android.location.Location getLastKnownLocation() {
    android.location.Location mLastLocation;
    if (!(checkPermission(android.Manifest.permission.ACCESS_FINE_LOCATION))) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ android.Manifest.permission.ACCESS_FINE_LOCATION }, 42);
    }
    if (checkPermission(android.Manifest.permission.ACCESS_FINE_LOCATION)) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        java.lang.System.out.println("location retrieved");
    }else {
        mLastLocation = null;
        java.lang.System.out.println("null location, permission check failed");
    }
    return mLastLocation;
}