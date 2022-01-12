public static ahmadadam96.comicbookmovies.Movie fetchMovieData(java.lang.String requestUrl, java.lang.String universe) {
    java.net.URL url = ahmadadam96.comicbookmovies.QueryUtils.createUrl(requestUrl);
    java.lang.String jsonResponse = null;
    try {
        jsonResponse = ahmadadam96.comicbookmovies.QueryUtils.makeHttpRequest(url);
    } catch (java.io.IOException e) {
        android.util.Log.e(ahmadadam96.comicbookmovies.QueryUtils.LOG_TAG, "Problem making the HTTP request to get the movie data.", e);
    }
    return ahmadadam96.comicbookmovies.QueryUtils.extractFeatureFromJson(jsonResponse, universe);
}