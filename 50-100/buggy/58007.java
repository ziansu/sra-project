@java.lang.Override
public retrofit2.Response<com.example.ronkassay_for_crossover.weather.WeatherInfo> execute() throws java.io.IOException {
    if (useCache) {
        if ((isCacheValid()) && ((lastKnownWeatherInfo) != null)) {
            return retrofit2.Response.success(lastKnownWeatherInfo);
        }
    }
    return fixResponseUsingLastKnown(apiCall.execute());
}