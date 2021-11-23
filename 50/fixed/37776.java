@dagger.Provides
@com.example.alexander.weatherapp.di.scopes.WeatherScope
com.example.alexander.weatherapp.business.weather.WeatherInteractor provideWeatherInteractor(com.example.alexander.weatherapp.data.repositories.WeatherApiRepository repository, com.example.alexander.weatherapp.business.mappers.WeatherModelToCityWeatherMapper mapper, com.example.alexander.weatherapp.data.repositories.SharedPrefsRepository sharedPrefs, com.example.alexander.weatherapp.job.JobWrapper jw, com.example.alexander.weatherapp.data.repositories.GooglePlacesApiRepository googlePlacesApiRepository, android.content.Context context) {
    return new com.example.alexander.weatherapp.business.weather.WeatherInteractorImpl(repository, mapper, sharedPrefs, jw, googlePlacesApiRepository, context);
}