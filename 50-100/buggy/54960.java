@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.util.Log.i(com.intersog.androidcourse.rimma.googlemaphw19.MapsActivity.TAG, "Location services connected.");
    startLocationUpdates();
    if ((mLastLocation) == null) {
        android.util.Log.i(com.intersog.androidcourse.rimma.googlemaphw19.MapsActivity.TAG, "mLastLocation == null");
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        handleNewLocation(mLastLocation);
    }
}