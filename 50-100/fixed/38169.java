@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.google.games.bridge.TokenFragment.RC_ACCT)) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
        if (result != null) {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount acct = result.getSignInAccount();
            onSignedIn(result.getStatus().getStatusCode(), acct);
            return ;
        }
    }
    super.onActivityResult(requestCode, resultCode, data);
}