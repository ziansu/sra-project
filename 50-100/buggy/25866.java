@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        android.content.Intent SettingsIntent = new android.content.Intent(getApplicationContext(), de.logbooker.AppSettings.class);
        SettingsIntent.putExtra(de.logbooker.SelectTripActivity.ORIGIN, "SelectTripActivtiy");
        startActivity(SettingsIntent);
    }
    return super.onOptionsItemSelected(item);
}