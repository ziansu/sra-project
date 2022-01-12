private static java.lang.String getHost(java.lang.String url) {
    try {
        return new java.net.URL(url).getHost();
    } catch (java.net.MalformedURLException e) {
        return null;
    }
}