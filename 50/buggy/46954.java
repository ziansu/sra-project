@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult result) {
    android.support.design.widget.Snackbar.make(this.findViewById(R.id.main_activity_view), ("Exception while connecting to Google Play services: " + (result.getErrorMessage())), Snackbar.LENGTH_INDEFINITE).show();
}