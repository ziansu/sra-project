@java.lang.Override
public void run() {
    getSharedPreferences();
    timber.log.Timber.d(("run: ===>>> PULLING TO REFRESH Weather==== Destination: " + (app.ga.com.headingout.inputfragment.tabfragment.InputWeatherTabFragment.destinationAirportCode)));
    app.ga.com.headingout.inputfragment.tabfragment.InputWeatherTabFragment.forecastApiKey = getResources().getString(R.string.forecast_api_key);
    app.ga.com.headingout.inputfragment.ApiManager.getForecastWeather(retrofit, bus, app.ga.com.headingout.inputfragment.tabfragment.InputWeatherTabFragment.forecastApiKey, app.ga.com.headingout.inputfragment.tabfragment.InputWeatherTabFragment.latitude, app.ga.com.headingout.inputfragment.tabfragment.InputWeatherTabFragment.longitude);
    weatherSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimaryLight, R.color.colorAccent, R.color.colorAccentDark);
    weatherSwipeRefreshLayout.setRefreshing(false);
}