public java.lang.String normalisePath(java.lang.String url) {
    url = url.toLowerCase();
    url = url.split("#")[0];
    url = url.split("\\?")[0];
    return url;
}