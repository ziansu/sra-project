@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.search :
            return true;
        case R.id.action_settings :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}