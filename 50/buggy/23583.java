@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.main_activity_settings, menu);
    android.view.MenuItem item = menu.findItem(R.id.action_change_units);
    setDisplayModeMenuItemIcon(item);
    return true;
}