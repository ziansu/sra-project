@java.lang.Override
public void onConnectionSuspended(int arg0) {
    if ((mGoogleApiClient) != null)
        mGoogleApiClient.connect();
    
}