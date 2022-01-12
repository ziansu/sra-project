@java.lang.Override
protected java.util.ArrayList<com.example.android.popluarmovies.movie> doInBackground(java.net.URL... urls) {
    java.net.URL url;
    url = createUrl((((com.example.android.popluarmovies.MainActivity.URL_BASE) + ((sort_pref) == 1 ? com.example.android.popluarmovies.MainActivity.POPULAR : com.example.android.popluarmovies.MainActivity.TOP_RATED)) + (com.example.android.popluarmovies.MainActivity.API_KEY)));
    java.lang.String jsonResponse = "";
    try {
        jsonResponse = makeHttpRequest(url);
    } catch (java.io.IOException e) {
        android.util.Log.e(com.example.android.popluarmovies.MainActivity.LOG_TAG, "Problem making the HTTP request.", e);
    }
    return com.example.android.popluarmovies.QueryUtils.extractDetails(jsonResponse);
}