@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    login = new com.androk.Login();
    android.view.View loginButton = findViewById(R.id.login_button);
    loginButton.setOnClickListener(this);
}