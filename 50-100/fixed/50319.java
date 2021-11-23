@java.lang.Override
public void afterCompletion(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response, final java.lang.Object handler, final java.lang.Exception ex) {
    org.terasoluna.gfw.web.token.transaction.TransactionTokenInterceptor.logger.trace("afterCompletion");
    if (ex != null) {
        org.terasoluna.gfw.web.token.transaction.TransactionTokenContextImpl tokenContext = ((org.terasoluna.gfw.web.token.transaction.TransactionTokenContextImpl) (request.getAttribute(org.terasoluna.gfw.web.token.transaction.TransactionTokenInterceptor.TOKEN_CONTEXT_REQUEST_ATTRIBUTE_NAME)));
        if (tokenContext != null) {
            org.terasoluna.gfw.web.token.transaction.TransactionToken token = tokenContext.getReceivedToken();
            removeToken(token);
        }
    }
}