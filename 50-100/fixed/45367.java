public static java.net.HttpURLConnection setupConnection(java.lang.String url, java.lang.String cookieName, java.lang.String cookieValue, java.lang.String login, java.lang.String password) throws java.io.IOException {
    java.lang.String cookie = ((cookieName == null) || (cookieName.isEmpty())) ? "" : (cookieName + "=") + cookieValue;
    return net.etuldan.sparss.utils.NetworkUtils.setupConnection(new java.net.URL(url), cookie, login, password);
}