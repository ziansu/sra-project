public boolean preCall(io.netty.handler.codec.http.HttpRequest request, org.wso2.carbon.mss.HttpResponder responder, org.wso2.carbon.mss.internal.router.HandlerInfo handlerInfo) {
    io.netty.handler.codec.http.HttpHeaders headers = request.headers();
    boolean isValidSignature = false;
    if (headers != null) {
        java.lang.String jwtHeader = headers.get(org.wso2.carbon.mss.example.hook.JWTSecurityInterceptor.JWT_HEADER);
        if (jwtHeader != null) {
            try {
                isValidSignature = verifySignature(jwtHeader);
            } catch (java.lang.Exception e) {
                log.error(("Error while JWT signature validation." + e));
                return false;
            }
        }
    }
    return isValidSignature;
}