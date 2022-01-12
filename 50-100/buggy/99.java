@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.superpak.sammengistu.stuckapp.StuckConstants.RC_SIGN_IN)) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
        if (result.isSuccess()) {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount account = result.getSignInAccount();
            mEncodedEmail = com.superpak.sammengistu.stuckapp.activities.StuckSignUpActivity.encodeEmail(account.getEmail());
        }else {
            android.widget.Toast.makeText(this, R.string.google_signin_failed, Toast.LENGTH_LONG).show();
        }
    }
}