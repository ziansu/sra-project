@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    mDrawerLayout.closeDrawers();
    menuItem.setChecked(true);
    switch (menuItem.getItemId()) {
        case R.id.nav_home :
            setToolbarTitle("主页");
            navigationDrawerItemSelected(0);
            break;
        case R.id.nav_messages :
            setToolbarTitle("发现");
            navigationDrawerItemSelected(1);
            break;
    }
    return true;
}