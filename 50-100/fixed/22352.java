public void googleSignIn(android.app.Activity context, int requestCode) {
    com.google.android.gms.auth.api.signin.GoogleSignInOptions gso = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestProfile().build();
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(context).addApi(Auth.GOOGLE_SIGN_IN_API, gso).build();
    android.content.Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
    mGoogleApiClient.connect();
    context.startActivityForResult(signInIntent, requestCode);
}