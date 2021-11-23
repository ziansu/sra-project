@java.lang.Override
protected void service(final javax.servlet.http.HttpServletRequest req, final javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    try {
        if (!(stroom.util.thread.ThreadScopeContextHolder.contextExists())) {
            throw new java.lang.IllegalStateException("ThreadScopeContext MUST EXIST");
        }
        stroom.servlet.SessionListListener.setLastRequest(req);
        super.service(req, resp);
    } catch (final java.lang.Exception ex) {
        stroom.dispatch.server.DispatchServiceImpl.LOGGER.error("handle() - {}", req.getRequestURI(), ex);
        throw ex;
    }
}