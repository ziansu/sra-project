protected static void sendInvalidCommand(com.sun.net.httpserver.HttpExchange t) throws java.io.IOException {
    server.httpserver.HttpAPIHandler.send(t, new org.json.JSONObject().append("status", false).append("error", "Invalid command"));
}