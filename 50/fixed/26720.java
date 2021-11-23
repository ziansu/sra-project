protected boolean isSmartLockAvailable() {
    return ((isGooglePlayServicesAvailable()) && ((mCredentialsClient) != null)) && (mCredentialsClient.isConnected());
}