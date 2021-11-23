@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
    android.widget.Toast.makeText(this, R.string.login_toast_error_identification, Toast.LENGTH_LONG);
}