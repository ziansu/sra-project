@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.content.Intent intent = getIntent();
    username = intent.getStringExtra("Username");
    username_TextV = ((android.widget.TextView) (findViewById(R.id.username_act_main)));
    username_TextV.setText(((username_TextV.getText().toString()) + (username)));
    initInstances();
}