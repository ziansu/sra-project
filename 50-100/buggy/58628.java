@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sign_up);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.hide();
    emailInput = ((android.widget.EditText) (findViewById(R.id.emailInput)));
    passwordInput = ((android.widget.EditText) (findViewById(R.id.passwordInput)));
    confirmPasswordInput = ((android.widget.EditText) (findViewById(R.id.confirmPasswordInput)));
    mAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
}