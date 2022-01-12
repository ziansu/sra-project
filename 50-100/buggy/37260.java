@java.lang.Override
public void onNext(com.example.guhao.myweather.bean.WeatherEntity weatherEntity) {
    android.util.Log.d(com.example.guhao.myweather.data.WeatherConstant.TAG, ("updateRawWeather: " + i));
    com.example.guhao.myweather.data.WeatherConstant.weatherList.set(i, weatherEntity);
    android.util.Log.d(com.example.guhao.myweather.data.WeatherConstant.TAG, ("onNext: " + (weatherEntity.toString())));
    adapter.updateFragment(i, com.example.guhao.myweather.data.WeatherConstant.getSingleCityFragment(weatherEntity), weatherEntity);
    layout.setRefreshing(false);
}