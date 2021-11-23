@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.home_menu, menu);
    android.view.MenuItem item = menu.findItem(R.id.menu_item_share);
    mShareActionProvider = ((android.support.v7.widget.ShareActionProvider) (android.support.v4.view.MenuItemCompat.getActionProvider(item)));
    return true;
}