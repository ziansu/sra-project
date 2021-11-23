private void initNavigationDrawer() {
    mDrawerToggle = new android.support.v7.app.ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close) {
        public void onDrawerClosed(android.view.View view) {
            if (org.gdg.frisbee.android.utils.PrefUtils.shouldOpenDrawerOnStart(org.gdg.frisbee.android.common.GdgNavDrawerActivity.this)) {
                org.gdg.frisbee.android.utils.PrefUtils.setShouldNotOpenDrawerOnStart(org.gdg.frisbee.android.common.GdgNavDrawerActivity.this);
            }
        }

        public void onDrawerOpened(android.view.View drawerView) {
        }
    };
    mDrawerLayout.setDrawerListener(mDrawerToggle);
    setupDrawerContent(mNavigationView);
}