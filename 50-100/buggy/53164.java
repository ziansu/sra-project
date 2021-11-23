private void gatherWeatherInfo(java.lang.String city) {
    com.urval.karl.moonweather.logic.WeatherUrlBuilder wub = new com.urval.karl.moonweather.logic.WeatherUrlBuilder();
    com.urval.karl.moonweather.logic.WeatherDataCollector wdc;
    try {
        wdc = new com.urval.karl.moonweather.logic.WeatherDataCollector(city, wub.buildUrl(city, 1), wub.buildUrl(city, 2), wub.buildUrl(city, 3));
        weathers.add(wdc.getWeather());
    } catch (java.util.concurrent.ExecutionException | java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    wAdapter.notifyDataSetChanged();
}