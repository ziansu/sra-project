@java.lang.Override
public void onBackPressed() {
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(getDrawerLayoutId())));
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
    }else {
        finish();
        startActivity(new android.content.Intent(this, onBackActivity()));
        overridePendingTransition(0, 0);
    }
}