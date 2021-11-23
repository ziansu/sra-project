public void initializeScreen() {
    android.widget.LinearLayout linearLayoutLoginActivity = ((android.widget.LinearLayout) (findViewById(R.id.linear_layout_login_activity)));
    initializeBackground(linearLayoutLoginActivity);
    mAuthProgressDialog = new android.app.ProgressDialog(this);
    mAuthProgressDialog.setTitle(getString(R.string.progress_dialog_loading));
    mAuthProgressDialog.setMessage(getString(R.string.progress_dialog_authenticating_with_firebase));
    mAuthProgressDialog.setCancelable(false);
    setupGoogleSignIn();
}