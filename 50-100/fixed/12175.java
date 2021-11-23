public static java.lang.String urlEncode(java.lang.Object value) {
    if (value == null)
        return null;
    
    try {
        java.lang.String result = java.net.URLEncoder.encode(value.toString(), "UTF-8");
        return result;
    } catch (java.io.UnsupportedEncodingException e) {
        return null;
    }
}