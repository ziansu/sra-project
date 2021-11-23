@java.lang.Override
protected java.util.ArrayList<java.lang.String[]> doInBackground(java.net.URL... params) {
    if ((params.length) == 0) {
        return null;
    }
    mMovieSearchUrl = params[0];
    try {
        java.lang.String movieSearchResults = com.example.android.moviesapp.NetworkUtils.getResponseFromHttpUrl(mMovieSearchUrl);
        java.util.ArrayList<java.lang.String[]> readableJsonMovieData = com.example.android.moviesapp.OpenMovieJsonUtils.getSimpleMovieStringsFromJson(this, movieSearchResults);
        java.lang.System.out.println("doInBackground done");
        return readableJsonMovieData;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}