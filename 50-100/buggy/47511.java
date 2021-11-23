@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.action_refresh :
            new com.example.sarh2o.sunshine.ForecastFragment.FetchWeatherTask().execute("94043");
            break;
        case R.id.action_setting :
            android.content.Intent settingActivityIntent = new android.content.Intent(getContext(), com.example.sarh2o.sunshine.SettingsActivity.class);
            startActivity(settingActivityIntent);
            break;
        default :
            break;
    }
    return super.onOptionsItemSelected(item);
}