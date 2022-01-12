public int launch() {
    try {
        java.net.ServerSocket myconnex = new java.net.ServerSocket(port, 6);
        this.state = STATE_LISTENING;
        int currentByte = -1;
        while (true) {
            java.net.Socket connexion = server.accept();
            try {
                java.io.InputStream is = connexion.getInputStream();
                java.io.BufferedInputStream bis = new java.io.BufferedInputStream(is);
                bis.write(MESSAGE_HELLO.getBytes());
            } finally {
            }
        } 
    } catch (java.io.IOException ex) {
        system.err.println(ex);
    }
}