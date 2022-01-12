@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle intent = getIntent().getExtras();
    setContentView(R.layout.activity_room);
    if (intent != null) {
        android.widget.TextView welcomeTextView = ((android.widget.TextView) (findViewById(R.id.welcomeText)));
        welcomeTextView.setText(("Successfully joined room: " + (intent.getString("roomName"))));
    }
}