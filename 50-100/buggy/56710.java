private void handleSignInResult(com.google.android.gms.auth.api.signin.GoogleSignInResult result) {
    android.util.Log.d(com.example.margonari.tdp2_frontend.activities.LogInActivity.TAG, ("handleSignInResult:" + (result.isSuccess())));
    if (result.isSuccess()) {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount acct = result.getSignInAccount();
        mStatusTextView.setText("SIGNED IN");
        updateUI(true);
        goToMainActivity();
    }else {
        updateUI(false);
    }
}