@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (drawerToggle.onOptionsItemSelected(item)) {
        return true;
    }
    switch (item.getItemId()) {
        case R.id.action_settings :
            return true;
    }
    return super.onOptionsItemSelected(item);
}