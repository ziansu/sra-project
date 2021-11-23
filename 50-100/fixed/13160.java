@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.default_toolbar)));
    setSupportActionBar(toolbar);
    mNavigationDrawer = ((org.intermine.fragment.NavigationDrawerFragment) (getFragmentManager().findFragmentById(R.id.navigation_drawer)));
    mNavigationDrawer.setUp(R.id.navigation_drawer, ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))), true);
    mGeneFavoritesList = new org.intermine.core.List(getString(R.string.gene_favorites_list_name));
}