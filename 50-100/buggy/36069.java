@java.lang.Override
public void filter(javax.ws.rs.container.ContainerRequestContext requestContext, javax.ws.rs.container.ContainerResponseContext responseContext) throws java.io.IOException {
    if ((requestContext.getMethod()) != "POST")
        return ;
    
    java.lang.String method = requestContext.getHeaderString("X-Http-Method-Override");
    if (method != null) {
        requestContext.setMethod(method);
    }
}