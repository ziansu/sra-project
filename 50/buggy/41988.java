@retrofit.http.GET(value = "api/place/nearbysearch/json?&key=AIzaSyBmEpSt0jy6YbuUXnwJT6GzgabYNeOjqJE")
retrofit.Call<com.my.game.wesport.POJO.Example> getNearbyPlaces(@retrofit.http.Query(value = "type")
java.lang.String type, @retrofit.http.Query(value = "location")
java.lang.String location, @retrofit.http.Query(value = "radius")
int radius);