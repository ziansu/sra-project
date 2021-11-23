private common.web.rest.RestServlet.RequestHandlerMapping getMapping(javax.servlet.http.HttpServletRequest request) {
    for (common.web.rest.RestServlet.RequestHandlerMapping mapping : requestMappings) {
        if (mapping.handles(request)) {
            return mapping;
        }
    }
    throw new java.lang.IllegalStateException(("No mapping specified for request: " + (request.getRequestURL())));
}