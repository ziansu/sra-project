@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_decks);
    butterknife.ButterKnife.bind(this);
    setSupportActionBar(toolbar);
    navigationView.setNavigationItemSelectedListener(this);
    android.support.v7.app.ActionBarDrawerToggle drawerToggle = new android.support.v7.app.ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open_drawer, R.string.nav_close_drawer);
    drawerLayout.setDrawerListener(drawerToggle);
    drawerToggle.syncState();
    setUpRecyclerView();
    loadData();
}