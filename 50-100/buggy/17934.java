@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    android.support.v4.app.Fragment fragment = getFragmentByNavigationItem(item.getItemId());
    if (null != fragment) {
        openFragment(fragment);
    }else {
        android.util.Log.e(se.accidis.fmfg.app.ui.MainActivity.TAG, "Trying to navigate to unrecognized fragment.");
    }
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
    return true;
}