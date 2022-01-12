@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    mPrefs = getSharedPreferences("com.example.jazminbrooks.woa", com.example.jazminbrooks.woa.MODE_PRIVATE);
    android.widget.Button launchHomeScreen = ((android.widget.Button) (findViewById(R.id.submitButton)));
    launchHomeScreen.setOnClickListener(this);
    mEmailField = ((android.widget.EditText) (findViewById(R.id.emailField)));
    mPasswordField = ((android.widget.EditText) (findViewById(R.id.passwordField)));
}