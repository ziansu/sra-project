@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.home_nav_item :
            navigateFragment(com.example.chungwei.placetogo.HomeFragment.newInstance(), true);
            break;
        case R.id.mission_nav_item :
            navigateFragment(com.example.chungwei.placetogo.MissionFragment.newInstance(), true);
            break;
        case R.id.near_by_nav_item :
            navigateFragment(com.example.chungwei.placetogo.NearByFragment.newInstance(), true);
            break;
        case R.id.history_nav_item :
            break;
        case R.id.settings_nav_item :
            break;
    }
    ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))).closeDrawer(GravityCompat.START);
    return true;
}