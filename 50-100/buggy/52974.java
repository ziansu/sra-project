@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    final com.example.rartonne.appftur.GlobalClass globalLogin = ((com.example.rartonne.appftur.GlobalClass) (getApplicationContext()));
    textUsername = ((android.widget.TextView) (findViewById(R.id.textUsername)));
    textUsername.setText(globalLogin.getLogin());
}