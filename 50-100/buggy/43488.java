@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.action_settings :
            return true;
        case R.id.action_add_new_service :
            return true;
        case R.id.action_check_services :
            db.open();
            db.checkServices();
            db.close();
            mAdapter.refreshItems();
            return true;
    }
    return super.onOptionsItemSelected(item);
}