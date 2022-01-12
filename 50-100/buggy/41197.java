@java.lang.Override
public void onBackPressed() {
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
    }else {
        if ((getFragmentManager().getBackStackEntryCount()) < 1) {
            exitDialog();
            if (appExit) {
                super.onBackPressed();
            }
        }
    }
}