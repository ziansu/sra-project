private static java.net.URL getURL(java.lang.String path, java.lang.String apiKey) {
    android.net.Uri uri = android.net.Uri.parse(com.sriky.popflix.utilities.NetworkUtils.TMDA_BASE_URL).buildUpon().appendPath(path).appendQueryParameter(com.sriky.popflix.utilities.NetworkUtils.PARAM_QUERY_API_KEP, apiKey).build();
    java.net.URL url = null;
    try {
        url = new java.net.URL(uri.toString());
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
    }
    return url;
}