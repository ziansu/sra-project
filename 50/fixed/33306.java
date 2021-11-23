@retrofit2.http.GET(value = "movie/{id}/reviews")
retrofit2.Call<com.udacity.movie.model.ReviewResp> getReviews(@retrofit2.http.Path(value = "id")
java.lang.String movieId, @retrofit2.http.Query(value = "api_key")
java.lang.String apiKey);