public static void main(java.lang.String[] args) {
    com.hamishrickerby.http_server.AppArguments arguments = new com.hamishrickerby.http_server.AppArguments(args);
    java.lang.Integer port = java.lang.Integer.getInteger(arguments.getOrDefault("-p", "5000"));
    com.hamishrickerby.http_server.SocketServer server = new com.hamishrickerby.http_server.SocketServer(port);
    try {
        java.lang.Thread.sleep(5000);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}