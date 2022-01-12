@java.lang.Override
public void onNext(com.busysnail.sunshineweather.model.Weather weather) {
    android.util.Log.i(com.busysnail.sunshineweather.MainActivity.TAG, ("Repos loaded " + weather));
    com.busysnail.sunshineweather.ForecastAdapter adapter = ((com.busysnail.sunshineweather.ForecastAdapter) (reposRecycleView.getAdapter()));
    adapter.setWeather(weather.dailyForecast);
    adapter.notifyDataSetChanged();
}