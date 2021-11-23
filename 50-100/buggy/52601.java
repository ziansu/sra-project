@java.lang.Override
public void setTimeout(int timeout) throws java.io.IOException, java.lang.UnsupportedOperationException, javax.servlet.ServletException {
    if ((request.getAttribute(Globals.COMET_TIMEOUT_SUPPORTED_ATTR)) == (java.lang.Boolean.TRUE)) {
        request.setAttribute(Globals.COMET_TIMEOUT_ATTR, java.lang.Integer.valueOf(timeout));
        if (request.isComet()) {
            request.setCometTimeout(timeout);
        }
    }else {
        throw new java.lang.UnsupportedOperationException();
    }
}