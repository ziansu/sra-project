@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_basic);
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, com.example.simplecropviewsample.BasicFragment.newInstance()).commit();
    }
    com.example.simplecropviewsample.FontUtils.setFont(findViewById(R.id.root_layout));
    initToolbar();
}