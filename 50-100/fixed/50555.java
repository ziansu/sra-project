@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    if (((currentMenuItem) != null) && ((currentMenuItem) != item)) {
        currentMenuItem.setChecked(false);
        com.jyutwaa.zhaoziliang.glimpse.Utils.SharedPreferenceUtils.setNaivigationMenuItemId(this, currentMenuItem.getItemId());
        currentMenuItem = item;
        currentMenuItem.setChecked(true);
        switchFragment(mTitleMap.get(currentMenuItem.getItemId()), findFragmentById(currentMenuItem.getItemId()));
    }
    drawer.closeDrawer(GravityCompat.END);
    return true;
}