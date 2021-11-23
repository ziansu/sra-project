@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_ok)) {
        if (CreateMyworkout()) {
            this.finish();
        }
    }else
        if (id == (android.R.id.home)) {
            this.finish();
        }
    
    return super.onOptionsItemSelected(item);
}