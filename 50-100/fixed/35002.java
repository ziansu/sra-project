@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    firebaseInitialization(savedInstanceState);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login_activity);
    firebase = new com.firebase.client.Firebase(com.example.swarren.smitter.frontend.Login_Activity.FIREBASE_URL);
    firebase.keepSynced(true);
    emailAddr = ((android.widget.EditText) (findViewById(R.id.email_address)));
    password = ((android.widget.EditText) (findViewById(R.id.password)));
    boolean loggedIn;
    loggedIn = (firebase.getAuth()) != null;
    if (loggedIn) {
        goToTweetList();
    }
}