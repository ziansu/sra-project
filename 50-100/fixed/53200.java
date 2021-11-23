@java.lang.SuppressWarnings(value = "StatementWithEmptyBody")
@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.nav_logout)) {
    }else
        if (id == (R.id.nav_manage)) {
        }
    
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
    return true;
}