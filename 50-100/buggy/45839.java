@java.lang.Override
public void onResponse(retrofit2.Call<com.hari.daggerpoc.service.weather.response.WeatherResponse> call, retrofit2.Response<com.hari.daggerpoc.service.weather.response.WeatherResponse> response) {
    android.util.Log.d("ScreenA", ("Response data -->" + (response.body().toString())));
    flow.Flow.get(context).setHistory(flow.History.single(new com.hari.daggerpoc.ui.presenter.ScreenB()), Flow.Direction.FORWARD);
    responseCache.setWeatherResponse(response.body());
}