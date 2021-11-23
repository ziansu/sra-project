@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
    android.util.Log.d(com.huhx0015.doordashchallenge.services.LocationService.LOG_TAG, "onConnectionFailed(): Google API client connection suspended.");
    if ((mListener) != null) {
        mIsLocationFound = true;
        mListener.onLocationFailed();
    }
}