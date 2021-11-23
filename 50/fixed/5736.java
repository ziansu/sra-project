@java.lang.Override
public rx.Observable<com.xiecc.seeWeather.modules.domain.City> call() {
    cityList = mWeatherDB.loadCities(mDBManager.getDatabase(), selectedProvince.ProSort);
    return rx.Observable.from(cityList);
}