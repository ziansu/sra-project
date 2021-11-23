@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login_screen);
    settings = getSharedPreferences("settings", 0);
    inputUsername = ((android.widget.EditText) (findViewById(R.id.UsernameLogIn)));
    inputPassword = ((android.widget.EditText) (findViewById(R.id.PasswordLogIn)));
    loginProgressBar = ((android.widget.ProgressBar) (findViewById(R.id.loginProgressBar)));
    loginProgressBar.setVisibility(View.GONE);
}