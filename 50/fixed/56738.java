private void revokeAccess() {
    if ((mGoogleApiClient) != null) {
        Auth.GoogleSignInApi.revokeAccess(mGoogleApiClient).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status>() {
            @java.lang.Override
            public void onResult(com.google.android.gms.common.api.Status status) {
            }
        });
    }
}