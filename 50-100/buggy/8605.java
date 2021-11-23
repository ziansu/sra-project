@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_settings :
            android.content.Intent settingsIntent = new android.content.Intent(this, com.stationmillenium.android.activities.SharedPreferencesActivity.class);
            startActivity(settingsIntent);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}