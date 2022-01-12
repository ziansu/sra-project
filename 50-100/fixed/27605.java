@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        startActivity(new android.content.Intent(getActivity(), com.gzr7702.movieguide.SettingsActivity.class));
        return true;
    }
    return super.onOptionsItemSelected(item);
}