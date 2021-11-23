private void initialize() {
    mAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
    baseActivity = new com.singhgurjit.firebaselogin.firebaseloginsample.BaseActivity();
    btnSignupSubmit = ((android.widget.Button) (findViewById(R.id.signup_submit_btn)));
    signupEmail = ((android.widget.EditText) (findViewById(R.id.signup_email)));
    signupPassword = ((android.widget.EditText) (findViewById(R.id.signup_password)));
}