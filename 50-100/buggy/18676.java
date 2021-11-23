@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    permissionCheck();
    if ((mCurrentLocation) == null) {
        try {
            mCurrentLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        } catch (java.lang.SecurityException e) {
            android.util.Log.e(com.sn1006.atkins.sprint.MainActivity.TAG, "getLastLocation securityException.");
        }
        updateLocationUI();
    }
    if (mRequestingLocationUpdates) {
        android.util.Log.i(com.sn1006.atkins.sprint.MainActivity.TAG, "in onConnected(), starting location updates");
        permissionCheck();
        startLocationUpdates();
    }
}