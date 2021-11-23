private static java.lang.String getHost(java.lang.String url) {
    try {
        return url == null ? null : new java.net.URL(url).getHost();
    } catch (java.net.MalformedURLException e) {
        return null;
    }
}