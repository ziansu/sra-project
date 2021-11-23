@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    switch (menuItem.getItemId()) {
        case R.id.navigation_sub_item_1 :
            menuItem.setChecked(true);
            setFragment(R.id.navigation_sub_item_1);
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        case R.id.navigation_sub_item_2 :
            menuItem.setChecked(true);
            setFragment(R.id.navigation_sub_item_2);
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
    }
    return true;
}