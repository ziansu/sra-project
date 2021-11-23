@java.lang.Override
protected void onStart() {
    super.onStart();
    com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> opr = Auth.GoogleSignInApi.silentSignIn(googleApiClient);
    if (opr.isDone()) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult result = opr.get();
        handleSignInResult(result);
    }else {
        opr.setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.auth.api.signin.GoogleSignInResult>() {
            @java.lang.Override
            public void onResult(@android.support.annotation.NonNull
            com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
                handleSignInResult(googleSignInResult);
            }
        });
    }
}