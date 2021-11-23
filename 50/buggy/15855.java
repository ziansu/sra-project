@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_send);
    textView = ((android.widget.TextView) (findViewById(R.id.full_json_data)));
    textView.setMovementMethod(new android.text.method.ScrollingMovementMethod());
}