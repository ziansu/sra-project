@retrofit2.http.GET(value = "/youtube/v3/search")
retrofit2.Call<com.ghazifardhan.downloadmusic.models.Youtube> getData(@retrofit2.http.Query(value = "key")
java.lang.String apiKey, @retrofit2.http.Query(value = "part")
java.lang.String snippet, @retrofit2.http.Query(value = "maxResults")
java.lang.Integer maxResults, @retrofit2.http.Query(value = "q")
java.lang.String videoId);