public void onDrawerOpened(android.view.View drawerView) {
    getSupportActionBar().setTitle(buildStyledString(mDrawerTitle));
    supportInvalidateOptionsMenu();
}