public void close() {
    mGoogleApiClient.disconnect();
    mGoogleApiClient = null;
}