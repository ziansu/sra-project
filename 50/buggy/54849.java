private boolean isSignedIn() {
    return ((googleApiClient) != null) && (googleApiClient.isConnected());
}