@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            this.finish();
            return true;
        case R.id.action_done :
            saveList();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}