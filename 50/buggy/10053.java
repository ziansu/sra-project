@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_drawer);
    toolbar = ((com.example.rocklct.bangumi.mybangumi.ui.activity.Toolbar) (findViewById(R.id.mytoolbar)));
    setSupportActionBar(toolbar);
    initTabs();
    initDrawer();
}