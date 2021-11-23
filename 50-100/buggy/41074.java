protected void createNvDrawer() {
    handler = new android.os.Handler();
    drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    android.support.v7.app.ActionBarDrawerToggle toggle = new android.support.v7.app.ActionBarDrawerToggle(this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    toggle.isDrawerIndicatorEnabled();
    toggle.syncState();
    toggle.setDrawerIndicatorEnabled(true);
    drawer.addDrawerListener(toggle);
    android.support.design.widget.NavigationView navigationView = ((android.support.design.widget.NavigationView) (findViewById(R.id.nav_view)));
    navigationView.setNavigationItemSelectedListener(this);
}