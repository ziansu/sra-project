@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    com.example.rartonne.appftur.GlobalClass globalLogin = ((com.example.rartonne.appftur.GlobalClass) (this));
    textUsername = ((android.widget.TextView) (findViewById(R.id.textUsername)));
    textUsername.setText(globalLogin.getLogin());
}