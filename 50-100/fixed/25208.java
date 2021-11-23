@java.lang.Override
public void onBackPressed() {
    final android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    if ((null != drawer) && (drawer.isDrawerOpen(GravityCompat.START))) {
        drawer.closeDrawer(GravityCompat.START);
    }else {
        super.onBackPressed();
    }
}