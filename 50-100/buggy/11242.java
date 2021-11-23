private synchronized void buildGoogleApiClient() {
    if ((mGoogleApiClient) == null) {
        mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(Nearby.MESSAGES_API, new com.google.android.gms.nearby.messages.MessagesOptions.Builder().setPermissions(NearbyPermissions.BLE).setPermissions(NearbyPermissions.MICROPHONE).setPermissions(NearbyPermissions.BLUETOOTH).build()).addConnectionCallbacks(this).enableAutoManage(this, this).build();
    }
}