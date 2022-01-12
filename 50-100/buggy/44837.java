protected java.lang.String buildUrl(java.lang.String path) {
    final java.lang.String url;
    if (path.startsWith(mBasePath))
        url = (((mUrl) + ":") + (mPort)) + path;
    else
        url = ((((mUrl) + ":") + (mPort)) + (mBasePath)) + path;
    
    return url.replace(" ", "%20");
}