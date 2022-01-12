@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    statusDisplay = new com.example.s162077.helloworld.StatusDisplay(this);
    statusDisplay.setListener(new com.example.s162077.helloworld.StatusDisplay.Listener() {
        @java.lang.Override
        public void onDisplay(java.lang.String information) {
            ((android.widget.EditText) (findViewById(R.id.edit_message))).setText(information);
        }
    });
    setContentView(R.layout.activity_article_fragment);
}