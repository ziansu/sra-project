private void initDrawer() {
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    android.support.v7.app.ActionBarDrawerToggle toggle = new android.support.v7.app.ActionBarDrawerToggle(this, drawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.setDrawerListener(toggle);
    toggle.syncState();
    android.support.design.widget.NavigationView navigationView = ((android.support.design.widget.NavigationView) (findViewById(R.id.nav_view)));
    android.view.MenuInflater inflater = getMenuInflater();
    navigationView.setNavigationItemSelectedListener(this);
}