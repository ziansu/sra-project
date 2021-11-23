@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    android.util.Log.v(LOG_TAG, "\nonOptionsItemSelected\n");
    if (id == (R.id.action_settings)) {
        return true;
    }
    if (id == (R.id.choose_location)) {
        android.content.Intent intent = new android.content.Intent(this, ranathome.mapshow.MapActivity.class);
        if ((intent.resolveActivity(getPackageManager())) != null) {
            startActivityForResult(intent, ranathome.mapshow.MainActivity.SHOW_MAP_CODE);
        }
        return true;
    }
    return super.onOptionsItemSelected(item);
}