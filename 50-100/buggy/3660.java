public boolean onOptionItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_refresh)) {
        com.example.android.sunshine.app.ForecastFragment.FetchWeatherTask weatherTask = new com.example.android.sunshine.app.ForecastFragment.FetchWeatherTask();
        weatherTask.execute();
        return true;
    }
    return super.onOptionsItemSelected(item);
}