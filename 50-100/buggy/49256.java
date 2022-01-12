@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.example.jason.fooder1.LoginPage.RC_SIGN_IN)) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
        if (result.isSuccess()) {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount account = result.getSignInAccount();
            firebaseAuthWithGoogle(account);
            handleResult(result);
        }else {
            updateUI(null);
        }
    }
}