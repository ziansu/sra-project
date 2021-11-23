protected E handleResponseError(org.eclipse.jetty.client.api.Response response, java.util.Optional<info.orestes.rest.client.ResponseListener.EntityContext> entityContext) throws info.orestes.rest.error.RestException {
    info.orestes.rest.error.RestException exception = entityContext.map(( context) -> {
        try {
            return context.getErrorReader(response).read();
        } catch (java.lang.Exception suppressed) {
            info.orestes.rest.error.RestException defaultException = getRestException(response);
            defaultException.addSuppressed(suppressed);
            return defaultException;
        }
    }).orElseGet(() -> getRestException(response));
    exception.setRemote(true);
    throw exception;
}