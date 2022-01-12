private static java.lang.String urlDecode(java.lang.String strUrl) {
    try {
        strUrl = strUrl.replace("\\x", "%").replace("%25", "%");
        java.lang.String decoded = java.net.URLDecoder.decode(strUrl, "UTF-8");
        return decoded.replaceAll("\\\\x[A-Za-z]{0,2}", " ").replace("\\", "");
    } catch (java.io.UnsupportedEncodingException | java.lang.IllegalArgumentException e) {
        return null;
    }
}