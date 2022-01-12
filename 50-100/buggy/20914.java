public void startLoading(android.location.Location location, int count) {
    java.lang.String weatherURL = (((((((WeatherAPI.WEATHER_URL) + (WeatherAPI.WEATHER_API_QUERY)) + (WeatherAPI.WEATHER_URL_GET_LAT)) + (location.getLatitude())) + (WeatherAPI.WEATHER_URL_GET_LON)) + (location.getLongitude())) + (WeatherAPI.WEATHER_URL_GET_COUNT)) + count;
    android.util.Log.d(com.beccap.weathervane.model.WeatherLoader.TAG, ("URL: " + weatherURL));
    new com.beccap.weathervane.model.WeatherLoader.WeatherJSONReader(weatherURL).execute();
}