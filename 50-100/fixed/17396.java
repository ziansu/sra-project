private static void parseLocatorUri(java.lang.String uri, java.lang.String[] scheme, java.lang.String[] location) {
    int iColon = uri.indexOf(':');
    if (iColon >= 0) {
        scheme[0] = uri.substring(0, iColon);
        location[0] = uri.substring((iColon + 1));
    }else {
        scheme[0] = uri;
        location[0] = "";
    }
}