private void onWPComEmailCheckError(boolean forceWordPressComDisplay) {
    if (!(isAdded())) {
        return ;
    }
    if (forceWordPressComDisplay) {
        showSelfHostedSignInForm();
        return ;
    }
    if (isUsernameEmail()) {
        showSelfHostedSignInForm();
    }else {
        showPasswordFieldAndFocus();
    }
}