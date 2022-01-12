@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_settings)) {
        android.content.Intent settingsIntent = new android.content.Intent(this, com.stationmillenium.android.activities.SharedPreferencesActivity.class);
        startActivity(settingsIntent);
        return true;
    }else
        return super.onOptionsItemSelected(item);
    
}