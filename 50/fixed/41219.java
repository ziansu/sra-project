public static java.lang.String urlDecode(java.lang.String str) {
    java.lang.String decodedStr = null;
    try {
        decodedStr = java.net.URLDecoder.decode(str, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
    }
    return decodedStr;
}