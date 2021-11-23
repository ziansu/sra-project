@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(mToolbar);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
    drawerFragment = ((me.tonyduco.tuhi.adapter.FragmentDrawer) (getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer)));
    drawerFragment.setUp(R.id.fragment_navigation_drawer, ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))), mToolbar);
    drawerFragment.setDrawerListener(this);
    displayView(1);
}