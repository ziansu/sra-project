@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    checkUserAuth();
    checkIntenetAuthentication();
    setView();
    buttonLogin.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            signIn();
        }
    });
}