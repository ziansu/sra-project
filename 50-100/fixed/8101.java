@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            finish();
            return true;
        case R.id.action_done :
            saveList();
            finish();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}