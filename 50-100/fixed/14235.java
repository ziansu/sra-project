@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.location.Location mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        if (mLastLocation != null) {
            searchResultMap.loadLocation(mLastLocation.getLatitude(), mLastLocation.getLongitude(), false);
        }else {
            searchResultMap.loadLocation(37.450254, 126.952557, false);
            android.widget.Toast.makeText(this, R.string.no_location_detected, Toast.LENGTH_LONG).show();
        }
    }
}