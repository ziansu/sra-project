protected static void sendInvalidCommand(com.sun.net.httpserver.HttpExchange t) throws java.io.IOException {
    server.httpserver.HttpAPIHandler.send(t, new org.json.JSONObject().put("status", false).put("error", "Invalid command"));
}