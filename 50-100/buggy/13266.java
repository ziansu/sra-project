private void updateShareIntent() {
    if ((((currentWeather) != null) && (isMenuVisible())) && ((getActivity()) instanceof laurenyew.weatherapp.detail.WeatherDetailPagerActivity)) {
        java.lang.String forecastData = currentWeather.getCurrentConditionsInSharingFormat();
        ((laurenyew.weatherapp.detail.WeatherDetailPagerActivity) (getActivity())).setWeatherDetailShareIntent(forecastData);
    }
}