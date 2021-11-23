private static void downloadMovieData() {
    java.lang.String response = null;
    try {
        response = andras.com.popularmovies.utils.MovieDataUtils.getResponseFromHttpUrl(andras.com.popularmovies.utils.MovieDataUtils.buildUrl());
    } catch (java.io.IOException e) {
        android.util.Log.e(andras.com.popularmovies.utils.MovieDataUtils.tag, e.getMessage());
        return ;
    }
    android.util.Log.v(andras.com.popularmovies.utils.MovieDataUtils.tag, response);
    try {
        andras.com.popularmovies.utils.MovieDataUtils.parseMovieJSON(response);
    } catch (org.json.JSONException e) {
        android.util.Log.e(andras.com.popularmovies.utils.MovieDataUtils.tag, e.getMessage());
    }
}