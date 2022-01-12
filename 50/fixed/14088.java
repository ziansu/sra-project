@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.home_menu, menu);
    android.view.MenuItem item = menu.findItem(R.id.menu_item_share);
    return true;
}