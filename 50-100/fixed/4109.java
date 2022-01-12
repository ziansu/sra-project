private void getPageContent(java.lang.String url) throws java.lang.Exception {
    java.net.URL obj = new java.net.URL(url);
    connection = ((java.net.HttpURLConnection) (obj.openConnection()));
    connection.setRequestMethod("GET");
    connection.setUseCaches(false);
    connection.setRequestProperty("User-Agent", USER_AGENT);
    connection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
    connection.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
    setCookies(connection.getHeaderFields().get("Set-Cookie"));
}