@java.lang.Override
public void setContentView(int layoutResID) {
    final android.view.View contentView = getLayoutInflater().inflate(layoutResID, mDrawerLayout, false);
    contentLayout.addView(contentView);
    setContentView(mDrawerLayout);
    initToolbar();
    initNavigationDrawer();
    initActionDrawerToggle();
}