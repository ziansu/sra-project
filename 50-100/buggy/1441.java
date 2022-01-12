@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_edit_account);
    java.lang.String pword = getIntent().getStringExtra("password");
    if (!(pword.isEmpty())) {
        android.widget.EditText password = ((android.widget.EditText) (findViewById(R.id.signup_password)));
        password.setText(pword);
    }
}