@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    refreshEvents();
}