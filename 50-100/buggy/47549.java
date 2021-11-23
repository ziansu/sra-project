protected void loginClick() {
    java.lang.String login = edtLogin.getText().toString();
    java.lang.String password = edtPassword.getText().toString();
    if (((login.length()) >= 2) && ((password.length()) > 6)) {
        callbackClick.loginClick(login, password);
    }
}