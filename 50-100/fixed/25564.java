public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_refresh :
            updateWeather();
            return true;
        case R.id.settings :
            android.content.Intent intent = new android.content.Intent(getActivity(), nanodegree.mani.com.sunshine.app.SettingsActivity.class);
            startActivity(intent);
            return true;
        case R.id.action_viewMap :
            viewOnMap();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}