@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    if (onl.deepspace.wgs.Helper.getHasNoAds(getBaseContext())) {
        android.view.MenuItem mi = menu.findItem(R.id.action_remads);
        mi.setVisible(false);
    }
    android.view.MenuItem selectChild = menu.findItem(R.id.action_select_child);
    if ((mChildren.length()) < 2) {
        selectChild.setVisible(false);
    }else {
        selectChild.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
    }
    return super.onPrepareOptionsMenu(menu);
}