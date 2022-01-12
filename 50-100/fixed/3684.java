public boolean isUrlValid(java.lang.String urlString) {
    if (!(android.text.TextUtils.isEmpty(urlString))) {
        java.net.URL url = null;
        try {
            url = new java.net.URL(urlString);
            return (!(android.text.TextUtils.isEmpty(url.getHost()))) && (!(android.text.TextUtils.isEmpty(url.getPath())));
        } catch (java.net.MalformedURLException e) {
            return false;
        }
    }
    return false;
}