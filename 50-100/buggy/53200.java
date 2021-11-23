@java.lang.SuppressWarnings(value = "StatementWithEmptyBody")
@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.nav_logout)) {
    }else
        if (id == (R.id.nav_manage)) {
        }else
            if (id == (R.id.one_restaurant)) {
                android.content.Intent intent = new android.content.Intent(getApplicationContext(), it.polito.group2.restaurantowner.Restaurant_page.class);
                startActivity(intent);
            }
        
    
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
    return true;
}