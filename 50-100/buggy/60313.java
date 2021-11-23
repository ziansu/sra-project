@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    switch (item.getItemId()) {
        case R.id.discarded :
            markDiscarded();
        case R.id.eaten :
            markEaten();
        case android.R.id.home :
            this.finish();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}