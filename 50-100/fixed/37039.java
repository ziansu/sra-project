private void toggleLoginRegister() {
    if (isRegistering) {
        mPasswordField.setImeOptions(EditorInfo.IME_ACTION_DONE);
        mConfirmPasswordField.setVisibility(View.GONE);
        mEmailLoginButton.setText(R.string.action_sign_in);
        mToggleLoginRegisterLink.setText(R.string.link_register);
    }else {
        mPasswordField.setImeOptions(EditorInfo.IME_ACTION_NEXT);
        mConfirmPasswordField.setVisibility(View.VISIBLE);
        mEmailLoginButton.setText(R.string.action_register);
        mToggleLoginRegisterLink.setText(R.string.link_sign_in);
    }
    isRegistering = !(isRegistering);
}