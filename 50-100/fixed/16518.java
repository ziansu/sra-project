@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_settings :
            com.sixbynine.infosessions.settings.SettingsActivity.launchActivityForResult(this, com.sixbynine.infosessions.home.MainActivity.SETTINGS_REQUEST_CODE);
            return true;
        case R.id.action_search :
            com.sixbynine.infosessions.search.SearchActivity.launchActivityForResult(this, com.sixbynine.infosessions.home.MainActivity.SEARCH_REQUEST_CODE, mInfoSessions);
            return true;
        case R.id.action_rate :
            startActivity(com.sixbynine.infosessions.util.StoreUtils.getStoreIntent());
            return true;
    }
    return super.onOptionsItemSelected(item);
}