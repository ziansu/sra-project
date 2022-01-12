@retrofit2.http.GET(value = "/3/movie/{path}")
public retrofit2.Call<com.christopherluc.popularmovies.data.MovieListResponse> getMovies(@retrofit2.http.Path(value = "path")
java.lang.String path, @retrofit2.http.Query(value = com.christopherluc.popularmovies.data.Constants.API_KEY_KEY)
java.lang.String key);