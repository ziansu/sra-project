@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViews();
    setSupportActionBar(mToolbar);
    if (savedInstanceState == null) {
        addFragment();
    }
    onCreateContentView();
    mToolbar.setTitleTextColor(android.support.v4.content.ContextCompat.getColor(this, R.color.white));
}