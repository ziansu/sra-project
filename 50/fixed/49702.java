@retrofit2.http.GET(value = "json?types=(cities)&key=" + (com.acbelter.weatherapp.data.BuildConfig.GOOGLE_PLACES_API_KEY))
io.reactivex.Observable<com.acbelter.weatherapp.data.placesmodel.Places> getPlaces(@retrofit2.http.Query(value = "input")
java.lang.String input);