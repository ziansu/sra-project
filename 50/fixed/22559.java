private void signIn() {
    android.content.Intent signIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
    startActivityForResult(signIntent, com.learnera.app.LoginActivity.RC_SIGN_IN);
}