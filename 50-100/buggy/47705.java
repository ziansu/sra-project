@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    final java.lang.String HOST = "10.10.0.11";
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home_page);
    final android.widget.EditText UserName = ((android.widget.EditText) (findViewById(R.id.username)));
    final android.widget.EditText Password = ((android.widget.EditText) (findViewById(R.id.password)));
    final android.widget.Button SignIn = ((android.widget.Button) (findViewById(R.id.Sign_in)));
}