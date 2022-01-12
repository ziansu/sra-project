@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_refresh)) {
        refreshWeather();
    }
    if (id == (R.id.action_add)) {
        addCity();
    }
    if (id == (R.id.action_settings)) {
        return true;
    }
    return super.onOptionsItemSelected(item);
}