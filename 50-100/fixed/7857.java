public static java.net.URL makeURL() {
    android.net.Uri uri = android.net.Uri.parse(com.example.sanket.newsapi.NetworkUtils.GITHUB_BASE_URL).buildUpon().appendQueryParameter(com.example.sanket.newsapi.NetworkUtils.PARAM_SOURCE, com.example.sanket.newsapi.NetworkUtils.source_value).appendQueryParameter(com.example.sanket.newsapi.NetworkUtils.PARAM_SORT, com.example.sanket.newsapi.NetworkUtils.SORT).appendQueryParameter(com.example.sanket.newsapi.NetworkUtils.PARAM_APIKEY, com.example.sanket.newsapi.NetworkUtils.APIKEY).build();
    java.net.URL url = null;
    try {
        url = new java.net.URL(uri.toString());
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
    }
    return url;
}