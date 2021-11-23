private <T extends net.vexelon.currencybg.app.ui.fragments.AbstractFragment> void selectDrawerItem(android.view.MenuItem menuItem, java.lang.Class<T> clazz) {
    net.vexelon.currencybg.app.ui.fragments.AbstractFragment fragment = null;
    try {
        showFragment(clazz);
        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        drawerLayout.closeDrawers();
    } catch (java.lang.Exception e) {
        android.util.Log.e(Defs.LOG_TAG, "Unknown drawer section!", e);
    }
}