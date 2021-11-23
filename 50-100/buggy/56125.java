private boolean executeModule(com.sun.net.httpserver.HttpExchange exchange) throws java.io.IOException {
    namvc.framework.httpcontext.NaMvcHttpContext httpContext = getHttpContext(exchange);
    boolean result = false;
    try {
        result = module.execute(httpContext);
    } catch (java.io.IOException ex) {
        java.lang.System.out.println(ex);
    } finally {
        return result;
    }
}