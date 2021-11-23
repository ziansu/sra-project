public java.lang.String normalisePath(java.lang.String url) {
    if (url.contains("/")) {
        url = url.substring(url.indexOf("/"));
    }else {
        url = "/";
    }
    return url;
}