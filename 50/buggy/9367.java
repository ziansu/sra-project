@java.lang.Override
public void onConnected(android.os.Bundle dataBundle) {
    LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    mBestReading = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    handleLocationChanged();
}