@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.d(TAG, "Login called");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.loginmentor);
    mentorid = ((android.widget.EditText) (findViewById(R.id.editText)));
    password = ((android.widget.EditText) (findViewById(R.id.editText2)));
    mlogin = ((android.widget.Button) (findViewById(R.id.button)));
    mlogin.setOnClickListener(this);
}