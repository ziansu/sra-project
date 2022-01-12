private void onWPComEmailCheckError(boolean forceWordPressComDisplay) {
    if (!(isAdded())) {
        return ;
    }
    if (forceWordPressComDisplay) {
        showPasswordFieldAndFocus();
        return ;
    }
    if (isUsernameEmail()) {
        showSelfHostedSignInForm();
    }else {
        showPasswordFieldAndFocus();
    }
}