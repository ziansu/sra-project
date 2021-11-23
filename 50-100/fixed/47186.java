@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    initLayouts();
    mEmailSignInButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            attemptLogin();
        }
    });
    registerButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            android.content.Intent intent = new android.content.Intent(getApplicationContext(), pl.edu.wat.gymnotes.activities.RegisterActivity.class);
            startActivity(intent);
        }
    });
}