@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    android.view.MenuItem item;
    item = menu.findItem(R.id.menu_refresh);
    item.setVisible(false);
    return true;
}