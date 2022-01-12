private void deleteCredentialsInSmartLock() {
    if (isSmartLockAvailable()) {
        return ;
    }
    com.google.android.gms.auth.api.credentials.Credential credential = new com.google.android.gms.auth.api.credentials.Credential.Builder(mUsername).setPassword(mPassword).build();
    Auth.CredentialsApi.delete(mCredentialsClient, credential).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status>() {
        @java.lang.Override
        public void onResult(com.google.android.gms.common.api.Status status) {
            org.wordpress.android.util.AppLog.i(T.NUX, (status.isSuccess() ? "SmartLock: credentials deleted for username: " + (mUsername) : "SmartLock: Credentials not deleted for username: " + (mUsername)));
        }
    });
}