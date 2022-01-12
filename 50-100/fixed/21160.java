@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.register);
    firebaseAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
    if ((firebaseAuth.getCurrentUser()) != null) {
        goHome();
    }
    avatarChosen = 0;
    findViews();
    register.setOnClickListener(this);
    signIn.setOnClickListener(this);
    standardAvatar.setOnClickListener(this);
}