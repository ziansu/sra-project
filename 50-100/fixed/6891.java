public static java.lang.String fetchWebpageData(java.lang.String requestUrl) {
    java.net.URL url = com.example.android.hashseparator.QueryUtils.createUrl(requestUrl);
    java.lang.String response = null;
    try {
        response = com.example.android.hashseparator.QueryUtils.makeHttpRequest(url);
    } catch (java.io.IOException e) {
        com.example.android.hashseparator.QueryUtils.exception = "Problem making the HTTP request.";
    }
    return response;
}