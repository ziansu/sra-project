@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent _intent) {
    if (requestCode == 2) {
        if ((isGPSEnabled()) && (isNetworkEnabled())) {
            BtnCheckIn.setEnabled(true);
            mGoogleApiClient.connect();
        }
    }
}