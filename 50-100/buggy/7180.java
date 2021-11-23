@java.lang.Override
protected void onStop() {
    org.acra.ACRA.getErrorReporter().putCustomData("MainActivity.onStop()", "callback method was invoked");
    android.util.Log.i(ro.pub.acs.mobiway.gui.main.MainActivity.TAG, "onStop() callback method was invoked");
    stopLocationUpdates();
    if (((googleApiClient) != null) && (googleApiClient.isConnected())) {
        googleApiClient.disconnect();
    }
    super.onStop();
}