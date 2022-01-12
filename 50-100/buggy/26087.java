@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list);
    android.content.Intent intent = getIntent();
    java.util.ArrayList<java.lang.String> schedule = intent.getStringArrayListExtra("schedule");
    java.lang.String playUrl = intent.getStringExtra("playUrl");
    android.widget.TextView textView = ((android.widget.TextView) (findViewById(R.id.textView)));
    textView.setText(schedule.toString());
}