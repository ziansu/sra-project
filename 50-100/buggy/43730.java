public static java.util.List<com.example.adrialwalters.booklistingapp.Book> fetchBookData(java.lang.String requestUrl) {
    android.util.Log.i(com.example.adrialwalters.booklistingapp.QueryUtils.LOG_TAG, "Test: fetchBookData() called...");
    java.net.URL url = com.example.adrialwalters.booklistingapp.QueryUtils.createUrl(requestUrl);
    java.lang.String jsonResponse = null;
    try {
        jsonResponse = com.example.adrialwalters.booklistingapp.QueryUtils.makeHttpRequest(url);
    } catch (java.io.IOException e) {
        android.util.Log.e(com.example.adrialwalters.booklistingapp.QueryUtils.LOG_TAG, "Problem making the HTTP request", e);
    }
    java.util.List<com.example.adrialwalters.booklistingapp.Book> books = com.example.adrialwalters.booklistingapp.QueryUtils.extractFeatureFromJson(jsonResponse);
    return books;
}