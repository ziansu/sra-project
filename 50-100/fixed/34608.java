@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);
    loginButton = ((com.facebook.login.widget.LoginButton) (findViewById(R.id.login)));
    if ((loginButton) != null) {
        loginButton.setReadPermissions("user_friends");
    }
    if (true) {
        goToNextActivity();
    }
}