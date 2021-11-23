public java.lang.String normalisePath(java.lang.String url) {
    url = url.replace('.', '/');
    url = url.replace('_', '.');
    if (url.contains("/")) {
        url = url.substring(url.indexOf("/"));
    }else {
        url = "/";
    }
    return url.toLowerCase();
}