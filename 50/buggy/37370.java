@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    item.setChecked(true);
    mDrawerLayout.closeDrawers();
    return true;
}