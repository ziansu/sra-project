protected void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.d(this.TAG, "Login called");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.loginmentor);
    this.mentorid = ((android.widget.EditText) (findViewById(R.id.editText)));
    this.password = ((android.widget.EditText) (findViewById(R.id.editText2)));
    this.mlogin = ((android.widget.Button) (findViewById(R.id.button)));
    this.mlogin.setOnClickListener(this);
}