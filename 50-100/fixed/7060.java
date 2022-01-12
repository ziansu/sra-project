@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_shared_preferences);
    textView = ((android.widget.TextView) (findViewById(R.id.textView)));
    editText = ((android.widget.EditText) (findViewById(R.id.editText)));
    retreiveString();
}