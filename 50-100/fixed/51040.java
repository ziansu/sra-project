@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getBaseContext());
    mNavigationDrawerFragment = ((com.cs4295.team.NavigationDrawerFragment) (getFragmentManager().findFragmentById(R.id.navigation_drawer)));
    mTitle = getTitle();
    mNavigationDrawerFragment.setUp(R.id.navigation_drawer, ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))));
}