@retrofit2.http.GET(value = "me/top/{type}")
retrofit2.Call<java.util.List<com.example.garrymckee.spop.Model.Track>> getTopTracks(@retrofit2.http.Header(value = "Authorization")
java.lang.String authHeader, @retrofit2.http.Path(value = "type")
java.lang.String type);