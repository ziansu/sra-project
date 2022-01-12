private void makeUser() {
    com.google.android.gms.auth.api.signin.GoogleSignInOptions gso = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).enableAutoManage(this, null).addApi(Auth.GOOGLE_SIGN_IN_API, gso).build();
    opr = Auth.GoogleSignInApi.silentSignIn(mGoogleApiClient);
}