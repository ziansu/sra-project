@java.lang.Override
protected void onResume() {
    super.onResume();
    setUpMapIfNeeded();
    android.util.Log.i(com.intersog.androidcourse.rimma.googlemaphw19.MapsActivity.TAG, ("onResume " + (mGoogleApiClient.isConnected())));
}