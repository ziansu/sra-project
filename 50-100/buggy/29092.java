private void initDrawer() {
    drawerToggle = new android.support.v7.app.ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
        @java.lang.Override
        public void onDrawerClosed(android.view.View drawerView) {
            super.onDrawerClosed(drawerView);
        }

        @java.lang.Override
        public void onDrawerOpened(android.view.View drawerView) {
            super.onDrawerOpened(drawerView);
        }
    };
    drawerLayout.setDrawerListener(drawerToggle);
}