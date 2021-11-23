@java.lang.Override
public void filter(javax.ws.rs.container.ContainerRequestContext requestContext) throws java.io.IOException {
    if (!(requestContext.getMethod().equals("POST")))
        return ;
    
    java.lang.String method = requestContext.getHeaderString("X-Http-Method-Override");
    if (method != null) {
        requestContext.setMethod(method);
    }
}