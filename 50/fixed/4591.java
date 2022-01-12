@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_settings :
            settingsActivity();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}