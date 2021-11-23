@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_book);
    android.content.Intent intent = getIntent();
    java.lang.String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    android.widget.TextView textView = new android.widget.TextView(this);
    textView.setTextSize(40);
    textView.setText((message + " ayy lmao"));
    textView.setX(64);
    textView.setY(64);
    setContentView(textView);
    getActionBar().setDisplayHomeAsUpEnabled(true);
}