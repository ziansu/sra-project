protected void service(org.eclipse.equinox.http.servlet.internal.servlet.HttpServletRequest request, org.eclipse.equinox.http.servlet.internal.servlet.HttpServletResponse response) throws java.io.IOException, org.eclipse.equinox.http.servlet.internal.servlet.ServletException {
    checkRuntime();
    java.lang.String alias = org.eclipse.equinox.http.servlet.internal.servlet.HttpServletRequestWrapperImpl.getDispatchPathInfo(request);
    if (alias == null) {
        alias = org.eclipse.equinox.http.servlet.internal.util.Const.SLASH;
    }
    java.lang.String queryString = request.getQueryString();
    if (queryString != null) {
        alias += '?' + queryString;
    }
    if (httpServiceRuntimeImpl.doDispatch(request, response, alias)) {
        return ;
    }
    response.sendError(HttpServletResponse.SC_NOT_FOUND, ("ProxyServlet: " + alias));
}