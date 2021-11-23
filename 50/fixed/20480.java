@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    if ((mDrawerToggle) != null)
        mDrawerToggle.onDrawerOpened(drawerView);
    
    if ((getSupportActionBar()) != null)
        getSupportActionBar().setTitle(R.string.app_name);
    
}