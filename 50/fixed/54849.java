public boolean isSignedIn() {
    return ((googleApiClient) != null) && (googleApiClient.isConnected());
}