@java.lang.Override
public boolean routeExchange(final com.sun.net.httpserver.HttpExchange exchange) throws java.io.IOException {
    if (assetDispatcher.routeExchange(exchange)) {
        return true;
    }else
        if (controllerDispatcher.routeExchange(exchange)) {
            return true;
        }
    
    return false;
}