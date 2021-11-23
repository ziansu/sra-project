public void addNavigationToolbar() {
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    navigationView = ((android.support.design.widget.NavigationView) (findViewById(R.id.nav_view)));
    drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    currentItemId = R.id.supplier;
    navigationMenu = new ro.netex.upack.MenuActivity();
    navigationMenu.setContext(this);
    navigationMenu.setNavigationToolbar(navigationView, menu, toolbar, drawer, currentItemId);
}