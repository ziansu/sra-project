@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.home :
            return true;
        case R.id.action_settings :
            return true;
    }
    return super.onOptionsItemSelected(item);
}