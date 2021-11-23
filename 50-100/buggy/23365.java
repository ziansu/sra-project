public void run() {
    log.info("server started");
    java.net.ServerSocket ss;
    try {
        ss = new java.net.ServerSocket(this.port);
        while (true) {
            java.net.Socket socket = ss.accept();
            com.cooksys.assessment.server.ClientHandler handler = new com.cooksys.assessment.server.ClientHandler(socket);
            executor.execute(handler);
        } 
    } catch (java.io.IOException e) {
        log.error("Something went wrong :/", e);
    }
}