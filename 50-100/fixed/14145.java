@java.lang.Override
public void filter(javax.ws.rs.container.ContainerRequestContext requestContext, javax.ws.rs.container.ContainerResponseContext responseContext) throws java.io.IOException {
    com.github.wesleyegberto.uuidtokenauthentication.cors.CorsEnablerFilter.log.info("Executing REST response filter");
    responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
    responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
    responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
    responseContext.getHeaders().add("Access-Control-Allow-Headers", "AUTH_TOKEN");
}