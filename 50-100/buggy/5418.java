@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult result) {
    com.google.android.gms.fit.samples.common.logger.Log.i(com.google.android.gms.fit.samples.basichistoryapi.MainActivity.TAG, ("Google Play services connection failed. Cause: " + (result.toString())));
    android.support.design.widget.Snackbar.make(this.findViewById(R.id.main_activity_view), ("Exception while connecting to Google Play services: " + (result.getErrorMessage())), Snackbar.LENGTH_INDEFINITE);
}