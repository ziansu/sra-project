private void showProgressDialog() {
    if (!(isUserLocationEnabled())) {
        toggleUserLocation(true);
    }
    gpsCountdownDialog = new android.app.Dialog(this);
    gpsCountdownDialog.setContentView(R.layout.dialog_gps_countdown);
    gpsCountdownDialog.setTitle(getResources().getString(R.string.getting_gps_fix));
    gpsCountdownDialog.setCancelable(false);
    gpsCountdownDialog.show();
    mTimer = new java.util.Timer();
    doCountDown();
}