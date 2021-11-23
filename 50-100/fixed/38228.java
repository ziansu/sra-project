public void retrieveWeatherInfoJsonString(int cityId, com.haringeymobile.ukweather.weather.WeatherInfoType weatherInfoType) {
    this.cityId = cityId;
    this.weatherInfoType = weatherInfoType;
    java.net.URL openWeatherMapUrl = weatherInfoType.getOpenWeatherMapUrl(cityId);
    retrieveWeatherInformationJsonStringTask = new com.haringeymobile.ukweather.weather.WorkerFragmentToRetrieveJsonString.RetrieveWeatherInformationJsonStringTask();
    retrieveWeatherInformationJsonStringTask.setContext(parentActivity);
    retrieveWeatherInformationJsonStringTask.execute(openWeatherMapUrl);
}