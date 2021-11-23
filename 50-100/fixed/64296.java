@java.lang.Override
public void handle(java.lang.String target, org.eclipse.jetty.client.Request baseRequest, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    baseRequest.setHandled(true);
    if (serverHost.equals(request.getServerName()))
        response.setStatus(status);
    else
        response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
    
}