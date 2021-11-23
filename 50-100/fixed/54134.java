private retrofit2.Call<com.example.ronkassay_for_crossover.weather.WeatherInfo> callApiAndGetCallback() {
    java.lang.String expectedCity = "city1";
    java.lang.String expectedCountry = "country1";
    com.example.ronkassay_for_crossover.weather.LocationInfo locationInfo = new com.example.ronkassay_for_crossover.weather.LocationInfo(expectedCity, expectedCountry);
    retrofit2.Call<com.example.ronkassay_for_crossover.weather.WeatherInfo> callExternal = model.getLatestWeatherInfo(locationInfo, false);
    org.mockito.Mockito.verify(api, org.mockito.Mockito.atLeastOnce()).getWeatherByCityAndCountry(((expectedCity + ",") + expectedCountry));
    return callExternal;
}