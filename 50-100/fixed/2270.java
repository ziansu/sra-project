@java.lang.Override
public void onStart() {
    super.onStart();
    com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> opr = Auth.GoogleSignInApi.silentSignIn(mGoogleApiClient);
    opr.setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.auth.api.signin.GoogleSignInResult>() {
        @java.lang.Override
        public void onResult(com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
            handleSignInResult(googleSignInResult);
        }
    });
}