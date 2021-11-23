public java.lang.String formatUrl(java.lang.String url) {
    java.lang.String result = url;
    if ((url == null) || (url.equals(""))) {
        return result;
    }
    if ((url.length()) <= 63) {
        result = java.net.IDN.toASCII(url);
    }
    while (result.matches(".*[#/?]$")) {
        result = result.substring(0, ((result.length()) - 1));
    } 
    return result;
}