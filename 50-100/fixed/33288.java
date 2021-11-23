@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (item.getItemId()) {
        case R.id.action_search :
            return true;
        case R.id.action_settings :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}