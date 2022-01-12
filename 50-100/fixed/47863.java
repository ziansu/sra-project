@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mNavigationDrawerFragment = ((com.andrewma.hoard.NavigationDrawerFragment) (getSupportFragmentManager().findFragmentById(R.id.navigation_drawer)));
    mTitle = getTitle();
    try {
        mNavigationDrawerFragment.setUp(R.id.navigation_drawer, ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))));
    } catch (java.lang.Throwable t) {
    }
}