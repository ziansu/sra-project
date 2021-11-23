public static java.net.URL getUrl() {
    android.net.Uri firelineUri = android.net.Uri.parse(com.erickirschenmann.fireline.utilities.NetworkUtils.FIRELINE_JSON_URL).buildUpon().build();
    try {
        return new java.net.URL(firelineUri.toString());
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
        return null;
    }
}