public static void main(java.lang.String[] args) throws java.io.IOException {
    java.lang.String filename = "TODO.csv";
    int port = 5964;
    try {
        com.applab.server.RivialServer server = new com.applab.server.RivialServer(port, filename);
        com.applab.server.RivialDaemon daemon = new com.applab.server.RivialDaemon(server);
        daemon.start();
        new java.lang.Thread(server).start();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}