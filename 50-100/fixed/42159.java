@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    switch (menuItem.getItemId()) {
        case R.id.navigation_sub_item_1 :
            setFragment(R.id.navigation_sub_item_1);
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        case R.id.navigation_sub_item_2 :
            setFragment(R.id.navigation_sub_item_2);
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
    }
    return true;
}