@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_save, menu);
    if (!(_readOnly)) {
        android.view.MenuItem item = menu.findItem(R.id.action_delete);
        item.setVisible(false);
    }
    return super.onCreateOptionsMenu(menu);
}