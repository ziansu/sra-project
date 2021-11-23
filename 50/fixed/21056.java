@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_results);
    setUpToolbar(getString(R.string.title_result));
    setUpTest();
    setUpViews();
}