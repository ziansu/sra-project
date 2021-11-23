@java.lang.Override
public javax.ws.rs.core.Response toResponse(T exception) {
    java.lang.String message = org.apache.commons.lang3.StringUtils.defaultString(exception.getMessage(), getDefaultExceptionMessage());
    javax.ws.rs.core.Response.Status status = getHttpStatus(exception);
    org.openur.remoting.xchange.rest.errorhandling.ErrorMessage errorMessage = new org.openur.remoting.xchange.rest.errorhandling.ErrorMessage(message, exception.getClass(), status);
    return javax.ws.rs.core.Response.status(status).entity(errorMessage).type(MediaType.APPLICATION_JSON).build();
}