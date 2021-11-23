@java.lang.Override
public void updateCurrentWeather(org.secuso.privacyfriendlyweather.database.CurrentWeatherData data) {
    if ((data == null) || ((data.getCity_id()) != (cityID))) {
        return ;
    }
    cityID = data.getCity_id();
    mAdapter = new org.secuso.privacyfriendlyweather.ui.RecycleList.CityWeatherAdapter(data, mDataSetTypes, getBaseContext());
    mRecyclerView.setAdapter(mAdapter);
    org.secuso.privacyfriendlyweather.database.CityToWatch cityToWatch = database.getCityToWatch(cityID);
    setTitle(cityToWatch.getCityName());
}