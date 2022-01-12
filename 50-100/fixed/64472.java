private void setupViewComponents() {
    container = ((android.view.ViewGroup) (findViewById(R.id.login_container)));
    aitLogo = ((android.widget.ImageView) (findViewById(R.id.login_aitLogo)));
    userIdEditText = ((android.support.v7.widget.AppCompatEditText) (findViewById(R.id.login_userIdTxt)));
    passwordEditText = ((android.support.v7.widget.AppCompatEditText) (findViewById(R.id.login_passwordTxt)));
    loginButton = ((android.widget.Button) (findViewById(R.id.login_loginBtn)));
}