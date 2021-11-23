@java.lang.SuppressWarnings(value = "StatementWithEmptyBody")
@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    samsung.labo.pl.locateyourtask.activities.MainActivity.itemId = item.getItemId();
    samsung.labo.pl.locateyourtask.activities.MainActivity.DrawerFragmentItem drawerFragmentItem = samsung.labo.pl.locateyourtask.activities.MainActivity.findDrawerItemFragmentWithId(samsung.labo.pl.locateyourtask.activities.MainActivity.itemId);
    if (drawerFragmentItem != null) {
        openFragment(drawerFragmentItem);
        rememberSelectedItem(drawerFragmentItem);
    }
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
    return true;
}