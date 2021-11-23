private static void handleRejection(javax.ws.rs.container.ContainerRequestContext requestContext, java.lang.Class<?> exceptionClass, java.lang.String errorMessage, int status) {
    io.craigmiller160.orgbuilder.server.dto.ErrorDTO error = new io.craigmiller160.orgbuilder.server.dto.ErrorDTO();
    error.setStatusCode(status);
    error.setExceptionName(exceptionClass.getSimpleName());
    error.setErrorMessage(errorMessage);
    requestContext.abortWith(javax.ws.rs.core.Response.status(status).entity(error).type(MediaType.APPLICATION_JSON).build());
}