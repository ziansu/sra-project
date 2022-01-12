@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    etPassword = ((android.widget.EditText) (findViewById(R.id.etPassword)));
    etUserName = ((android.widget.EditText) (findViewById(R.id.etUsername)));
    btnLog = ((android.widget.Button) (findViewById(R.id.btnLogin)));
    tvregisterLink = ((android.widget.TextView) (findViewById(R.id.tvRegisterLink)));
    btnLog.setOnClickListener(this);
}