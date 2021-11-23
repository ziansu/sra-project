@java.lang.Override
public javax.ws.rs.core.Response toResponse(final T e) {
    javax.ws.rs.core.Response.Status responseStatus = this.status;
    if ((responseStatus == null) && (e instanceof com.intuit.wasabi.experimentobjects.exceptions.WasabiException)) {
        responseStatus = javax.ws.rs.core.Response.Status.fromStatusCode(((com.intuit.wasabi.experimentobjects.exceptions.WasabiException) (e)).getErrorCode().getResponseCode());
    }
    return httpHeader.headers(responseStatus).type(type).entity(serialize(type, responseStatus, e.getMessage())).build();
}