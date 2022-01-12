@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings1)) {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.example.android.trendingmovies.SettingsActivity.class);
        startActivity(intent);
    }
    return super.onOptionsItemSelected(item);
}