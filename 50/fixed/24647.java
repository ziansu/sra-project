private static java.net.URL createUrl(java.lang.String stringUrl) {
    java.net.URL url = null;
    try {
        url = new java.net.URL(stringUrl);
    } catch (java.net.MalformedURLException e) {
        android.util.Log.e(com.example.adrialwalters.booklistingapp.QueryUtils.LOG_TAG, "Problem building the URL");
    }
    return url;
}