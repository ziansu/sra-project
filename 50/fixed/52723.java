@java.lang.Override
protected void onStop() {
    mGoogleApiClient.disconnect();
    super.onStop();
}