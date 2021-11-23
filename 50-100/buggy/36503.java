private java.lang.String getReferer() {
    java.lang.String referer = request.getHeader("Referer");
    com.google.common.base.Preconditions.checkState((referer != null), "The Referer header was not specified");
    java.lang.String refererPath = null;
    try {
        refererPath = new java.net.URL(referer).getPath();
    } catch (java.net.MalformedURLException e) {
        refererPath = referer;
    }
    java.lang.String ctxPath = request.getContextPath();
    return refererPath.substring(((refererPath.indexOf(ctxPath)) + (ctxPath.length())));
}