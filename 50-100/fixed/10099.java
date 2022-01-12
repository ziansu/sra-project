private void googleAuthentification(final io.nearby.android.data.source.local.UserLoginStatusCallback callback) {
    com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> resultOptionalPendingResult = Auth.GoogleSignInApi.silentSignIn(mGoogleApiClient);
    if (resultOptionalPendingResult.isDone()) {
        handleGoogleResult(resultOptionalPendingResult.get(), callback);
    }else {
        resultOptionalPendingResult.setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.auth.api.signin.GoogleSignInResult>() {
            @java.lang.Override
            public void onResult(@android.support.annotation.NonNull
            com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
                handleGoogleResult(googleSignInResult, callback);
            }
        });
    }
}