private void listenSources() {
    try {
        java.lang.System.out.println("Waiting for connection from sources...");
        sourceSocket = new java.net.ServerSocket(7001);
        while (true) {
            java.net.Socket sourceSocket = this.sourceSocket.accept();
            java.lang.System.out.println((("Connection from source: " + (sourceSocket.getInetAddress())) + " was established."));
            notifySink(sourceSocket);
            sourceSocket.close();
            java.lang.System.out.println("Waiting for connection from sources...");
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}