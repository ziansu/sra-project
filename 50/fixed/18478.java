@java.lang.Override
protected void doExceptionCaught(org.kaazing.gateway.transport.http.HttpAcceptSession session, java.lang.Throwable cause) throws java.lang.Exception {
    wsebSession.setCloseException(cause);
    session.setStatus(HttpStatus.SERVER_INTERNAL_ERROR);
    wsebSession.close(true);
}