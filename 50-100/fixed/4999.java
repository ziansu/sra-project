@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mNavigationDrawerFragment = ((com.appbrainmob.bubblesoft.homeworkguru.activities.NavigationDrawerFragment) (getFragmentManager().findFragmentById(R.id.navigation_drawer)));
    mTitle = getTitle();
    mNavigationDrawerFragment.setUp(R.id.navigation_drawer, ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))));
}