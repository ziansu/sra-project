protected javax.ws.rs.core.Response handleGenericError(java.lang.Throwable exception) {
    net.sf.mmm.util.exception.api.NlsRuntimeException userError = net.sf.mmm.util.exception.api.TechnicalErrorUserException.getOrCreateUserException(exception);
    if (userError.isTechnical()) {
        io.oasp.module.rest.service.impl.RestServiceExceptionFacade.LOG.error("Service failed on server", exception);
    }else {
        io.oasp.module.rest.service.impl.RestServiceExceptionFacade.LOG.warn("Service failed due to business error: {}", exception.getMessage());
    }
    return createResponse(userError);
}