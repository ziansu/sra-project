@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sign_up);
    butterknife.ButterKnife.bind(this);
    mSignUpButton.setOnClickListener(this);
    mAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
    createAuthStateListener();
}