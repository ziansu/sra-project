@java.lang.Override
protected void onStop() {
    if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected())) {
        android.util.Log.d(edu.umbc.cs.iot.clients.android.UMBCIoTApplication.getDebugTag(), "Disconnecting API client");
        unsubscribe();
    }
    super.onStop();
}