@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.Intent intent = getIntent();
    java.lang.String location = intent.getStringExtra(MainActivity.LOCATION_KEY);
    android.util.Log.d("intent", ("Location: " + location));
    android.widget.TextView textView = new android.widget.TextView(this);
    textView.setTextSize(40);
    textView.setText((((R.string.display_location_text) + ": ") + location));
    setContentView(textView);
}