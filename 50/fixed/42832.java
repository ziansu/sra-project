@java.lang.Override
protected void onStop() {
    if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected())) {
        unsubscribe();
    }
    super.onStop();
}