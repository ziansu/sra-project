@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.settings :
            android.content.Intent settingsIntent = new android.content.Intent(this, dalbers.com.noise.SettingsActivity.class);
            settingsIntent.putExtra(dalbers.com.noise.MainActivity.PREF_USE_DARK_MODE_KEY, usingDarkMode);
            startActivity(settingsIntent);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}