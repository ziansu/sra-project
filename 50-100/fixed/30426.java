public void startRunning() {
    try {
        server = new java.net.ServerSocket(6789, 100);
        while (true) {
            try {
                waitForConnection();
                setupStreams();
                whileCompile();
            } catch (java.io.EOFException eofException) {
                java.lang.System.out.println("Server ended connection");
            } finally {
            }
        } 
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}