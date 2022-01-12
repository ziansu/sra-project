@java.lang.Override
public void onResume() {
    super.onResume();
    if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected()))
        startAsyncStationsUpdate();
    
}