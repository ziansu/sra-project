@java.lang.Override
public void filter(javax.ws.rs.container.ContainerRequestContext requestContext, javax.ws.rs.container.ContainerResponseContext responseContext) throws java.io.IOException {
    com.github.wesleyegberto.uuidtokenauthentication.cors.CorsEnablerFilter.log.info("Executing REST response filter");
    requestContext.getHeaders().add("Access-Control-Allow-Origin", "*");
    requestContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
    requestContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
    requestContext.getHeaders().add("Access-Control-Allow-Headers", "AUTH_TOKEN");
}