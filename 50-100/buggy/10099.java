private void googleAuthentification(final io.nearby.android.data.source.local.UserLoginStatusCallback callback) {
    mGoogleApiClient.connect();
    com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> resultOptionalPendingResult = Auth.GoogleSignInApi.silentSignIn(mGoogleApiClient);
    if (resultOptionalPendingResult.isDone()) {
        handleGoogleResult(resultOptionalPendingResult.get(), callback);
        mGoogleApiClient.disconnect();
    }else {
        resultOptionalPendingResult.setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.auth.api.signin.GoogleSignInResult>() {
            @java.lang.Override
            public void onResult(@android.support.annotation.NonNull
            com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
                mGoogleApiClient.disconnect();
                handleGoogleResult(googleSignInResult, callback);
            }
        });
    }
}