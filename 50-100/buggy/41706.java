public static java.lang.String domain() {
    java.net.URL url = im.connector.api.rest.App.url();
    final java.lang.String host = url.getHost();
    if (host.equals("localhost")) {
        return null;
    }else {
        return host.substring(((host.indexOf('.')) - 1));
    }
}