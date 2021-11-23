@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.Parse.initialize(this, "rImfNv4tT49YDypqeW0EBVwwES7b8GBIeeilMjsi", "HUbrGgOnHXM3DpWo2aHJ8AGZUyHOhFOPokyEoLNJ");
    com.facebook.FacebookSdk.sdkInitialize(getApplicationContext());
    loginBtn = ((com.facebook.login.widget.LoginButton) (findViewById(R.id.login_button)));
}