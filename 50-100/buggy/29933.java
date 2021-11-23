public java.lang.String formatUrl(java.lang.String url) {
    if (((url.equals("")) || (url == null)) || ((url.length()) > 63)) {
        return url;
    }
    java.lang.String result = java.net.IDN.toASCII(url);
    while (result.matches(".*[#/?]$")) {
        result = result.substring(0, ((result.length()) - 1));
    } 
    return result;
}