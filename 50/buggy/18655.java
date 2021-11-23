@retrofit2.http.GET(value = "v1/public/characters")
retrofit2.Call<java.util.List<com.example.citilin.heroesofmarvel_v19.network.responses.PojoMarvel>> getData(@retrofit2.http.Query(value = "ts")
java.lang.String ts, @retrofit2.http.Query(value = "apikey")
java.lang.String apikey, @retrofit2.http.Query(value = "hash")
java.lang.String hash);