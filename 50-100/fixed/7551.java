@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_searchable);
    actionbar = getSupportActionBar();
    if ((actionbar) != null) {
        actionbar.setTitle("搜尋");
        actionbar.setDisplayHomeAsUpEnabled(true);
    }
    if ((getIntent()) != null) {
        handleIntent(getIntent());
    }
}