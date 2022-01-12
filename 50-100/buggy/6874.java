private void getDeviceLocation() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(getContext(), android.Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        mLocationPermissionGranted = true;
    }else {
        android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ android.Manifest.permission.ACCESS_FINE_LOCATION }, me.kahlout.rangebuddy.DistanceFragment.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
    }
    if (mLocationPermissionGranted) {
        mCurrentLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    }
}