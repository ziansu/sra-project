public static java.util.List<com.example.admin.booklisting.Book> fetchBookData(java.lang.String requestUrl) {
    java.net.URL url = com.example.admin.booklisting.QueryUtils.createUrl(requestUrl);
    java.lang.String jsonResponse = null;
    try {
        jsonResponse = com.example.admin.booklisting.QueryUtils.makeHttpRequest(url);
        android.util.Log.i(com.example.admin.booklisting.QueryUtils.LOG_TAG, jsonResponse);
    } catch (java.io.IOException e) {
        android.util.Log.e(com.example.admin.booklisting.QueryUtils.LOG_TAG, "Error closing input stream", e);
    }
    java.util.List<com.example.admin.booklisting.Book> books = com.example.admin.booklisting.QueryUtils.extractFeatureFromJson(jsonResponse);
    return books;
}