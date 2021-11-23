@retrofit.http.GET(value = "/weather")
com.libarguys.companion.model.WeatherResponse getWeather(@retrofit.http.Query(value = "lat")
java.lang.Double lat, @retrofit.http.Query(value = "lon")
java.lang.Double lon, @retrofit.http.Query(value = "units")
java.lang.String units);