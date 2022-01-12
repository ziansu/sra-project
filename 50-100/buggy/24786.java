private void updateFragment() {
    final com.example.alenor.weatherapplication.Weather newCityInfo = mDBHelper.getCityInformation(mSelectedTabName);
    mWeatherFragment = new com.example.alenor.weatherapplication.WeatherFragment() {
        @java.lang.Override
        public com.example.alenor.weatherapplication.Weather getWeather() {
            return newCityInfo;
        }
    };
    mFragmentManager = getFragmentManager();
    mTransaction = mFragmentManager.beginTransaction();
    mTransaction.replace(com.example.alenor.weatherapplication.MainActivity.WEATHER_FRAGMENT_LAYOUT, mWeatherFragment);
    mTransaction.commit();
}