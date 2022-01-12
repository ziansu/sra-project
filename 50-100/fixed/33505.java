public static void main(java.lang.String[] args) {
    server.YTJBServer server;
    try {
        server = new server.YTJBServer();
        if (server.parseArguments(args)) {
            server.updateYoutubeDL();
            server.startUp();
        }
    } catch (java.io.IOException e) {
        utilities.IO.printlnDebug(null, "given port is in use!");
        e.printStackTrace();
    }
}