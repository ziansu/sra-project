static java.lang.String encoder(java.lang.String var) {
    try {
        return java.net.URLEncoder.encode(var, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
        return null;
    }
}