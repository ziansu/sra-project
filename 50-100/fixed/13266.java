private void updateShareIntent() {
    if ((isMenuVisible()) && ((getActivity()) instanceof laurenyew.weatherapp.detail.WeatherDetailPagerActivity)) {
        java.lang.String forecastData = ((currentWeather) != null) ? currentWeather.getCurrentConditionsInSharingFormat() : null;
        ((laurenyew.weatherapp.detail.WeatherDetailPagerActivity) (getActivity())).setWeatherDetailShareIntent(forecastData);
    }
}