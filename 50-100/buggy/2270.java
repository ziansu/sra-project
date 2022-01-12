@java.lang.Override
public void onStart() {
    super.onStart();
    com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> opr = Auth.GoogleSignInApi.silentSignIn(mGoogleApiClient);
    if (opr.isDone()) {
        android.util.Log.d(com.example.jcdug.andnonogame.MainActivity.TAG, "Got cached sign-in");
        com.google.android.gms.auth.api.signin.GoogleSignInResult result = opr.get();
        handleSignInResult(result);
    }else {
        opr.setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.auth.api.signin.GoogleSignInResult>() {
            @java.lang.Override
            public void onResult(com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
                handleSignInResult(googleSignInResult);
            }
        });
    }
}