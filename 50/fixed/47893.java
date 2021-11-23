@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_refresh)) {
        GlanceService.singleton.refresh("user");
        return true;
    }
    return super.onOptionsItemSelected(item);
}