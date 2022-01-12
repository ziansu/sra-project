static java.lang.String parseGetRequest(java.lang.String i_URI, java.util.HashMap<java.lang.String, java.lang.String> params) {
    java.lang.String parsedURI = "";
    int indexOfSeperator = i_URI.indexOf("?");
    if (indexOfSeperator > (-1)) {
        java.lang.String[] URIandParams = i_URI.split("\\?");
        if ((URIandParams.length) == 2) {
            params = webserver.Parser.handleEncodedParams(URIandParams[1]);
            parsedURI = URIandParams[0];
        }
    }else {
        parsedURI = i_URI;
        params = null;
    }
    return parsedURI;
}