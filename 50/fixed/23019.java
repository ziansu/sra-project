@javax.annotation.Nullable
private common.web.rest.RestServlet.RequestHandlerMapping getMapping(@javax.annotation.Nonnull
javax.servlet.http.HttpServletRequest request) {
    for (common.web.rest.RestServlet.RequestHandlerMapping mapping : requestMappings) {
        if (mapping.handles(request)) {
            return mapping;
        }
    }
    return null;
}