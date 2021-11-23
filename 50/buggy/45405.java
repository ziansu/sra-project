@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((R.id.action_refresh) == (item.getItemId())) {
        updateWeather();
        android.util.Log.d("Fragment", "execute");
        return true;
    }
    return super.onOptionsItemSelected(item);
}