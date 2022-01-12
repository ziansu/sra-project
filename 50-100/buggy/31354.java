@java.lang.SuppressWarnings(value = "StatementWithEmptyBody")
@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.nav_swimmers)) {
        android.util.Log.d(TAG, "nav_swimmers");
        android.content.Intent intent = new android.content.Intent(this, cnleon.com.cnleonapp.activities.CategoriesActivity.class);
        startActivity(intent);
    }
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
    return true;
}