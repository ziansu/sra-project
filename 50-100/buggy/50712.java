private void disconnect() {
    try {
        Plus.AccountApi.revokeAccessAndDisconnect(mGoogleApiClient).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status>() {
            @java.lang.Override
            public void onResult(com.google.android.gms.common.api.Status status) {
                mGoogleApiClient = buildGoogleApiClient();
                savedCallbackContext.success("disconnected");
            }
        });
    } catch (java.lang.IllegalStateException e) {
        savedCallbackContext.success("disconnected");
    }
}