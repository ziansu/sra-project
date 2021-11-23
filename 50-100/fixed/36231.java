@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cheat);
    android.content.Intent intent = getIntent();
    RANDOM_NUMBER = intent.getIntExtra("RandomNumber", 2);
    cheatTitle = ((android.widget.TextView) (findViewById(R.id.cheatTitle)));
    cheatDisplay = ((android.widget.TextView) (findViewById(R.id.cheatDisplay)));
}