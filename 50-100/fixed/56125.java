private boolean executeModule(com.sun.net.httpserver.HttpExchange exchange) {
    boolean result = false;
    try {
        namvc.framework.httpcontext.NaMvcHttpContext httpContext = getHttpContext(exchange);
        result = module.execute(httpContext);
    } catch (java.io.IOException ex) {
        java.lang.System.out.println(ex);
    } finally {
        return result;
    }
}