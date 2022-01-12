private java.lang.String getReferer() {
    java.lang.String referer = request.getHeader("Referer");
    com.google.common.base.Preconditions.checkState((referer != null), "The Referer header was not specified");
    java.lang.String refererPath = referer;
    try {
        refererPath = new java.net.URL(referer).getPath();
    } catch (java.net.MalformedURLException e) {
        refererPath = referer;
    }
    java.lang.String path = request.getContextPath();
    return refererPath.substring(((refererPath.indexOf(path)) + (path.length())));
}