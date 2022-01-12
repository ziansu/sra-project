protected E handleResponseError(org.eclipse.jetty.client.api.Response response, info.orestes.rest.client.ResponseListener.EntityContext entityContext) throws info.orestes.rest.error.RestException {
    info.orestes.rest.error.RestException exception = null;
    if (entityContext != null) {
        try {
            exception = entityContext.getErrorReader(response).read();
        } catch (java.lang.Exception suppressed) {
            exception = getRestException(response);
            exception.addSuppressed(suppressed);
        }
    }
    if (exception == null) {
        exception = getRestException(response);
    }
    exception.setRemote(true);
    throw exception;
}