private void parseGetParameters(com.sun.net.httpserver.HttpExchange exchange) throws java.io.UnsupportedEncodingException {
    java.util.Map<java.lang.String, java.lang.String> parameters = new java.util.HashMap<java.lang.String, java.lang.String>();
    java.net.URI requestedUri = exchange.getRequestURI();
    java.lang.String query = requestedUri.getRawQuery();
    parseQuery(query, parameters);
    exchange.setAttribute("parameters", parameters);
}