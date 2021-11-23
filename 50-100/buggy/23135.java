@java.lang.Override
public javax.ws.rs.core.Response toResponse(javax.ws.rs.NotFoundException exception) {
    log.info(java.lang.String.format("Resource was not found for method %s at %s, failed with: %s", request.getMethod(), request.getRequestURL(), exception.getMessage()), exception);
    return javax.ws.rs.core.Response.status(Status.NOT_FOUND).type(MediaType.TEXT_PLAIN).header("Requested-URL", request.getRequestURL()).entity(exception.getMessage()).build();
}