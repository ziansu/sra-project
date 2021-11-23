public static void main(java.lang.String[] args) {
    try {
        shared.Log.setLogger("logFile.txt", "ServerLog");
        java.lang.String ip = "localhost";
        int port = 9999;
        new server.ChatServer().runServer(ip, port);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
}