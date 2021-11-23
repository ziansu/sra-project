private static java.lang.String getServiceName(javax.servlet.http.HttpServletRequest req) {
    java.lang.String serviceName = req.getHeader(ServiceProtocol.SERVICE_NAME);
    if (serviceName == null) {
        serviceName = req.getParameter(ServiceProtocol.SERVICE_NAME);
    }
    if (serviceName == null) {
        serviceName = ((java.lang.String) (req.getAttribute(ServiceProtocol.SERVICE_NAME)));
    }
    return serviceName;
}