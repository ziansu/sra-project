static java.lang.String[] parseGetRequest(java.lang.String i_URI) {
    int indexOfSeperator = i_URI.indexOf("?");
    if (indexOfSeperator > (-1)) {
        java.lang.String[] URIandParams = i_URI.split("\\?");
        if ((URIandParams.length) == 2) {
            return URIandParams;
        }
    }
    return null;
}