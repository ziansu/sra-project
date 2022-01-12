private java.lang.String getRelativeUrlPath(org.hippoecm.hst.core.request.HstRequestContext requestContext, java.lang.String relativeUrlform) {
    java.lang.String result = relativeUrlform;
    java.lang.String defaultContextPath = mount.getVirtualHost().getVirtualHosts().getDefaultContextPath();
    if ((relativeUrlform.startsWith(defaultContextPath)) && (mount.isContextPathInUrl())) {
        result = result.substring(defaultContextPath.length());
    }
    return result;
}