@java.lang.Override
public void onBackPressed() {
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
        cardsList.clear();
        setStartLocationOption();
    }else {
        super.onBackPressed();
    }
}