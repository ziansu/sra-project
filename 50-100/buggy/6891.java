public static java.lang.String fetchWebpageData(java.lang.String requestUrl, android.content.Context context) {
    java.net.URL url = com.example.android.hashseparator.QueryUtils.createUrl(requestUrl, context);
    java.lang.String response = null;
    try {
        response = com.example.android.hashseparator.QueryUtils.makeHttpRequest(url, context);
    } catch (java.io.IOException e) {
        com.example.android.hashseparator.QueryUtils.exception = "Problem making the HTTP request.";
    }
    return response;
}