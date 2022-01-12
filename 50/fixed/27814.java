@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_toggle)) {
        toggle();
        return true;
    }
    return super.onOptionsItemSelected(item);
}