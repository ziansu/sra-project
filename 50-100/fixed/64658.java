@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    firebaseConnection = new ivanc.swap.FirebaseConnection(this);
    setContentView(R.layout.activity_home);
    mNavigationDrawerFragment = ((ivanc.swap.NavigationDrawerFragment) (getSupportFragmentManager().findFragmentById(R.id.navigation_drawer)));
    mTitle = getTitle();
    mNavigationDrawerFragment.setUp(R.id.navigation_drawer, ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))));
}