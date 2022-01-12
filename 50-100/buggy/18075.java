@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_page);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    setTitle("");
    android.widget.ScrollView scrollView = ((android.widget.ScrollView) (findViewById(R.id.main_scroll_view)));
    load_linear_layout("all");
}