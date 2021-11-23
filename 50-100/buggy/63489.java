private void updateWeather() {
    if (BuildConfig.DEBUG) {
        android.util.Log.d(LOG_TAG, "updateWeather Start.");
    }
    com.dev.tonylyu.sunshine.FetchWeatherTask weatherTask = new com.dev.tonylyu.sunshine.FetchWeatherTask(getActivity());
    java.lang.String location = com.dev.tonylyu.sunshine.Utility.getPreferredLocation(getActivity());
    weatherTask.execute(location);
    android.net.Uri weatherForLocationUri = WeatherContract.WeatherEntry.buildWeatherLocationWithStartDate(location, java.lang.System.currentTimeMillis());
    mCursorLoader.setUri(weatherForLocationUri);
}