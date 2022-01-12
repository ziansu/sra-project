@java.lang.Override
public void handle(java.lang.String s, org.eclipse.jetty.server.Request jettyRequest, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    jettyRequest.setHandled(true);
    try {
        handler.handle(request, response);
    } catch (java.lang.Exception e) {
        if (!(response.isCommitted())) {
            response.sendError(501, e.getMessage());
        }
    }
}