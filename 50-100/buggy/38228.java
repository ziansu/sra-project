public void retrieveWeatherInfoJsonString(int cityId, com.haringeymobile.ukweather.weather.WeatherInfoType weatherInfoType) {
    if (com.haringeymobile.ukweather.utils.MiscMethods.isUserOnline(parentActivity)) {
        this.cityId = cityId;
        this.weatherInfoType = weatherInfoType;
        java.net.URL openWeatherMapUrl = weatherInfoType.getOpenWeatherMapUrl(cityId);
        retrieveWeatherInformationJsonStringTask = new com.haringeymobile.ukweather.weather.WorkerFragmentToRetrieveJsonString.RetrieveWeatherInformationJsonStringTask();
        retrieveWeatherInformationJsonStringTask.setContext(parentActivity);
        retrieveWeatherInformationJsonStringTask.execute(openWeatherMapUrl);
    }else {
        android.widget.Toast.makeText(parentActivity, R.string.error_message_no_connection, Toast.LENGTH_SHORT).show();
    }
}