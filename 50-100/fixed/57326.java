@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_refresh)) {
        app.com.example.android.sunshine.ForecastFragment.FetchWeatherTask weatherTask = new app.com.example.android.sunshine.ForecastFragment.FetchWeatherTask();
        weatherTask.execute("6173331");
        return true;
    }
    return super.onOptionsItemSelected(item);
}