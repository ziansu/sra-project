@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_basic);
    android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag(com.example.simplecropviewsample.BasicFragment.class.getSimpleName());
    if (fragment == null) {
        fragment = com.example.simplecropviewsample.BasicFragment.newInstance();
    }
    getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).commit();
    com.example.simplecropviewsample.FontUtils.setFont(findViewById(R.id.root_layout));
    initToolbar();
}