@java.lang.Override
protected java.util.HashMap<java.lang.String, com.edsapps.weather.model.ForecastList> doInBackground(java.lang.Void... string) {
    java.util.HashMap<java.lang.String, com.edsapps.weather.model.ForecastList> forecastMap = com.edsapps.weather.utility.FeedHelper.getForecastDays();
    if (forecastMap == null) {
        WeatherService.httpClient.interceptors().add(fakeInterceptor);
        forecastMap = com.edsapps.weather.utility.FeedHelper.getForecastDays();
        WeatherService.httpClient.interceptors().remove(fakeInterceptor);
        com.edsapps.weather.utility.FeedHelper.faked = true;
    }else {
        com.edsapps.weather.utility.FeedHelper.faked = false;
    }
    return forecastMap;
}