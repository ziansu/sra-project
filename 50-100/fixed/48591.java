@java.lang.Override
public java.lang.String encodeURL(javax.servlet.ServletContext ctx, javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, java.lang.String url, org.zkoss.web.servlet.http.Encodes.URLEncoder defaultEncoder) throws java.lang.Exception {
    if (request instanceof org.zkoss.web.portlet.RenderHttpServletRequest) {
        javax.servlet.http.HttpServletRequest httpServletRequest = ((javax.servlet.http.HttpServletRequest) (request));
        url = (((url + "?") + (lan.test.portlet.zk.wsrp.session.DualSessionHelper.PORTLET_SESSION_ID)) + "=") + (httpServletRequest.getSession().getId());
    }
    return defaultEncoder.encodeURL(ctx, request, response, url, defaultEncoder);
}