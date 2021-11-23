private rx.Observable<java.util.ArrayList<com.dux.weather_forecast.model.WeatherViewModel>> load() {
    return apiService.getWeather("Zhytomyr").startWith(cacheService.getWeather("")).subscribeOn(rx.schedulers.Schedulers.io()).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread());
}