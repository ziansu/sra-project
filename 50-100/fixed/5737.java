private java.lang.String getReferer() {
    java.lang.String referer = request.getHeader("Referer");
    com.google.common.base.Preconditions.checkState((referer != null), "The Referer header was not specified");
    java.lang.String path = request.getContextPath();
    return referer.substring(((referer.indexOf(path)) + (path.length())));
}