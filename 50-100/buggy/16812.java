@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.example.a15017470.solemates.LoginActivity.RC_SIGN_IN)) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
        progress.setMessage("Signing in");
        progress.show();
        if (result.isSuccess()) {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount account = result.getSignInAccount();
            firebaseAuthWithGoogle(account);
        }else {
            progress.dismiss();
            checkUserExist();
        }
    }
}