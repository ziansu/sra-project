private boolean checkPlayServices() {
    int resultCode = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
    if (resultCode != (com.google.android.gms.common.ConnectionResult.SUCCESS)) {
        if (com.google.android.gms.common.GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
        }else {
            android.widget.Toast.makeText(getApplicationContext(), "This device is not supported.", Toast.LENGTH_LONG).show();
            finish();
        }
        return false;
    }
    return true;
}