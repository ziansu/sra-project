@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    groupButton = ((android.widget.Button) (findViewById(R.id.groupButton)));
    groupButton.setOnClickListener(this);
    messagesButton = ((android.widget.Button) (findViewById(R.id.messagesButton)));
}