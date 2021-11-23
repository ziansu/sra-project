public static java.lang.String decodeURIComponent(java.lang.String s) {
    if (s == null) {
        return null;
    }
    java.lang.String result = null;
    try {
        result = java.net.URLDecoder.decode(s, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        result = s;
    }
    result = result.trim();
    return result;
}