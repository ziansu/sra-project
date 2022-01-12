@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_editor);
    android.content.Intent intent = getIntent();
    cols = 20;
    rows = 24;
    if (intent != null) {
        cols = intent.getExtras().getInt("columns");
        rows = intent.getExtras().getInt("rows");
    }
}