public static java.util.List<viktorkhon.com.udacity_project_7_booklistingapp.Book> fetchBookData(java.lang.String requestUrl) {
    java.net.URL url = viktorkhon.com.udacity_project_7_booklistingapp.QueryUtils.createUrl(requestUrl);
    java.lang.String jsonResponse = null;
    try {
        jsonResponse = viktorkhon.com.udacity_project_7_booklistingapp.QueryUtils.makeHttpRequest(url);
    } catch (java.io.IOException e) {
        android.util.Log.e(viktorkhon.com.udacity_project_7_booklistingapp.MainActivity.LOG_TAG, "Problem making the HTTP request.", e);
    }
    return viktorkhon.com.udacity_project_7_booklistingapp.QueryUtils.parseJsonData(jsonResponse);
}