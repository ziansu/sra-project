private static java.net.URL buildMovieListUrl(java.lang.String path) {
    try {
        return new java.net.URL(android.net.Uri.parse(com.android.pobla.popularmovies.model.MovieDbUrlBuilder.MOVIES_DB_BASE_URL).buildUpon().appendPath(path).appendQueryParameter(com.android.pobla.popularmovies.model.MovieDbUrlBuilder.API_KEY, BuildConfig.API_KEY).toString());
    } catch (java.net.MalformedURLException e) {
        android.util.Log.i(com.android.pobla.popularmovies.model.MovieDbUrlBuilder.class.toString(), "Error parsing url", e);
    }
    return null;
}