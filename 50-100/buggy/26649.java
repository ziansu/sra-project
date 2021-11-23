private void sendUnauthorized(javax.servlet.http.HttpServletResponse response, boolean close) {
    try {
        if (close) {
            response.setHeader(IWAConstants.AUTHENTICATE_HEADER, IWAConstants.NEGOTIATE_HEADER);
            response.addHeader(IWAConstants.HTTP_CONNECTION_HEADER, IWAConstants.CONNECTION_CLOSE);
        }else {
            response.setHeader(IWAConstants.AUTHENTICATE_HEADER, IWAConstants.NEGOTIATE_HEADER);
            response.addHeader(IWAConstants.HTTP_CONNECTION_HEADER, IWAConstants.CONNECTION_KEEP_ALIVE);
        }
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.flushBuffer();
    } catch (java.io.IOException e) {
        org.wso2.carbon.identity.application.authenticator.iwa.servlet.IWAServelet.log.error(("Error when sending unauthorized response." + e));
    }
}