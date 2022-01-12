@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (item.getItemId()) {
        case R.id.action_search :
            openSearch();
            return true;
        case R.id.action_settings :
            openSettings();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}