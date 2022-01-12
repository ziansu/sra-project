@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    if (id == (R.id.remove_friend)) {
        interfacer.removeFriend(friend, this);
        return true;
    }
    return super.onOptionsItemSelected(item);
}