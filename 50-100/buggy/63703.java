private void initializeViews() {
    mNavigationDrawerFragment = ((com.levigilad.javaplay.NavigationDrawerFragment) (getFragmentManager().findFragmentById(R.id.navigation_drawer)));
    mNavigationDrawerFragment.setUp(R.id.navigation_drawer, ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))), GameOptions.GAMES.ordinal());
    setTitle(getString(R.string.app_name));
}