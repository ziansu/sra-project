public void close() {
    if ((mGoogleApiClient) != null)
        mGoogleApiClient.disconnect();
    
    mGoogleApiClient = null;
}