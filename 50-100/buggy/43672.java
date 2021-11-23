private boolean checkPlayServices() {
    int resultCode = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
    if (resultCode != (com.google.android.gms.common.ConnectionResult.SUCCESS)) {
        if (com.google.android.gms.common.GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
            com.google.android.gms.common.GooglePlayServicesUtil.getErrorDialog(resultCode, this, com.lancekrogers.stormy.ui.MainActivity.PLAY_SERVICES_RESOLUTION_REQUEST).show();
        }else {
            android.widget.Toast.makeText(getApplicationContext(), "This device is not supported.", Toast.LENGTH_LONG).show();
            finish();
        }
        return false;
    }
    return true;
}