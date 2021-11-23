public static java.util.List<com.example.android.moviefragment.Movie> fetchMovieData(java.lang.String requestURL, java.lang.Boolean favorites) {
    java.net.URL url = com.example.android.moviefragment.MovieQuery.createUrl(requestURL);
    java.lang.String jsonResponse = null;
    com.example.android.moviefragment.MovieQuery.favoritesCheck = favorites;
    try {
        jsonResponse = com.example.android.moviefragment.MovieQuery.makeHttpRequest(url);
    } catch (java.io.IOException e) {
        android.util.Log.e(com.example.android.moviefragment.MovieQuery.LOG_TAG, "Error closing input stream", e);
    }
    java.util.List<com.example.android.moviefragment.Movie> movies = com.example.android.moviefragment.MovieQuery.extractMovies(jsonResponse, com.example.android.moviefragment.MovieQuery.favoritesCheck);
    return movies;
}