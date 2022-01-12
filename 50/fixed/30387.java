public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setTitle("Setari");
    }
    invalidateOptionsMenu();
}