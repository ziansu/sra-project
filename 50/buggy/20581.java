private java.lang.String getPreUrl(java.lang.String preUrl) {
    java.lang.String defaultUrl = "userOperate/";
    if (!(preUrl.equals(""))) {
        preUrl = defaultUrl;
    }
    return preUrl;
}