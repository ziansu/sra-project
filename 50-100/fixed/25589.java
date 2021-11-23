private java.lang.String buildClientVariantUrl(java.lang.String context, org.opencms.gwt.shared.CmsClientVariantInfo info) {
    java.lang.String currentUrl = Window.Location.getHref();
    currentUrl = currentUrl.replaceFirst("#.*$", "");
    java.lang.String connector = "?";
    if ((currentUrl.indexOf('?')) >= 0) {
        connector = "&";
    }
    java.lang.String targetUrl = (((currentUrl + connector) + (org.opencms.gwt.shared.CmsGwtConstants.PARAM_TEMPLATE_CONTEXT)) + "=") + context;
    return targetUrl;
}