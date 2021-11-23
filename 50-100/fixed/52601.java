@java.lang.Override
public void setTimeout(int timeout) throws java.io.IOException, java.lang.UnsupportedOperationException, javax.servlet.ServletException {
    if (java.lang.Boolean.TRUE.equals(request.getAttribute(Globals.COMET_TIMEOUT_SUPPORTED_ATTR))) {
        request.setAttribute(Globals.COMET_TIMEOUT_ATTR, java.lang.Integer.valueOf(timeout));
        if (request.isComet()) {
            request.setCometTimeout(timeout);
        }
    }else {
        throw new java.lang.UnsupportedOperationException();
    }
}