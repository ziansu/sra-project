public static java.lang.String getUsername(com.sun.net.httpserver.HttpExchange exchange) {
    java.lang.String userSessionId = exchange.getRequestHeaders().getFirst("Cookie");
    int i;
    if ((userSessionId == null) || (userSessionId.equals("0")))
        return null;
    
    for (i = 0; i < (MuzikrWeb.sessionIds.size()); i++) {
        if ((MuzikrWeb.sessionIds.get(i)) == (java.lang.Integer.parseInt(userSessionId)))
            return MuzikrWeb.loginUsernames.get(i);
        
    }
    return null;
}