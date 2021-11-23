protected void handleInvalidUsernameOrPassword(int messageId) {
    mErroneousLogInCount += 1;
    if ((mErroneousLogInCount) >= (org.wordpress.android.ui.accounts.SignInFragment.WPCOM_ERRONEOUS_LOGIN_THRESHOLD)) {
        mPasswordEditText.setError(null);
        mUsernameEditText.setError(null);
        showInvalidUsernameOrPasswordDialog();
    }else {
        showPasswordError(messageId);
        showUsernameError(messageId);
    }
    endProgress();
}