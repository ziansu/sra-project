@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setTheme(R.style.AppTheme);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setToolbar();
    setupDrawer();
    if (savedInstanceState == null) {
        com.clt.conventionlogistictracker.NewsFragment newsFragment = new com.clt.conventionlogistictracker.NewsFragment();
        android.support.v4.app.FragmentManager managerHome = getSupportFragmentManager();
        managerHome.beginTransaction().replace(R.id.frame_content, newsFragment, newsFragment.getTag()).commit();
    }
}