@butterknife.OnClick(value = R.id.login_button)
public void onLoginClicked() {
    java.lang.String username = mUsername.getText().toString();
    java.lang.String password = mPassword.getText().toString();
    if (!(isLoginValid(username, password))) {
        return ;
    }
    showLoadingSpinner(true, false);
    login(username, password);
}