@java.lang.Override
public void onBackPressed() {
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
    }else {
        int count = getFragmentManager().getBackStackEntryCount();
        if (count == 0) {
            if ((categoryLevel) > 0) {
                moveBackwardsInCatalogue();
            }
        }else {
            drawer.openDrawer(GravityCompat.START);
            getFragmentManager().popBackStack();
        }
    }
}