@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_toggle_service :
            android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
            boolean collectingData = sharedPreferences.getBoolean(Preferences.PREFERENCE_COLLECTING_DATA, true);
            if (collectingData)
                stopService();
            else
                startService();
            
            android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(Preferences.PREFERENCE_COLLECTING_DATA, (!collectingData));
            editor.apply();
        default :
            return super.onOptionsItemSelected(item);
    }
}