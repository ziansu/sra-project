private static java.lang.String urlDecode(java.lang.String strUrl) {
    try {
        strUrl = strUrl.replace("\\x", "%").replace("%25", "%");
        return java.net.URLDecoder.decode(strUrl, "UTF-8");
    } catch (java.io.UnsupportedEncodingException | java.lang.IllegalArgumentException e) {
        return "";
    }
}