private void handleSignInResult(com.google.android.gms.auth.api.signin.GoogleSignInResult result) {
    if (result.isSuccess()) {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount acct = result.getSignInAccount();
        firebaseAuthWithGoogle(acct);
        android.content.Intent intent = new android.content.Intent(this, net.medhatblog.olxclone.NavigationActivity.class);
        startActivity(intent);
        finish();
    }
}