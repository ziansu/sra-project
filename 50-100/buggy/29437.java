private void processResponse(org.apache.catalina.connector.Request request, org.apache.catalina.connector.Response response, org.wso2.carbon.tomcat.ext.valves.CompositeValve compositeValve, org.wso2.carbon.webapp.authenticator.framework.WebappAuthenticator.Status status) {
    switch (status) {
        case SUCCESS :
        case CONTINUE :
            this.getNext().invoke(request, response, compositeValve);
        case FAILURE :
            org.wso2.carbon.webapp.authenticator.framework.AuthenticationFrameworkUtil.handleResponse(request, response, HttpServletResponse.SC_UNAUTHORIZED, "Failed to authorize the incoming request");
    }
}