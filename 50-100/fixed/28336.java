@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_settings)) {
        android.content.Intent settingsIntent = new android.content.Intent(getActivity(), me.balaaagi.popularmovies.activities.MoviePreferenceSettingsActivity.class);
        startActivity(settingsIntent);
        return true;
    }
    return super.onOptionsItemSelected(item);
}