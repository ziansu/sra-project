@java.lang.Override
public java.lang.Boolean onActivityKeyDown(com.bitlove.fetlife.view.activity.BaseActivity baseActivity, int keyCode, android.view.KeyEvent e) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_MENU)) {
        android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (menuActivity.findViewById(R.id.drawer_layout)));
        if (!(drawer.isDrawerOpen(GravityCompat.START))) {
            drawer.openDrawer(GravityCompat.START);
            return true;
        }
    }
    return false;
}