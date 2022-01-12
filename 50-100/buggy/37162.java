private void setUpNavigationDrawer() {
    drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    android.support.v7.app.ActionBarDrawerToggle toggle = new android.support.v7.app.ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.setDrawerListener(toggle);
    toggle.syncState();
    android.support.design.widget.NavigationView navigationView = ((android.support.design.widget.NavigationView) (findViewById(R.id.nav_view)));
    navigationView.setNavigationItemSelectedListener(this);
}