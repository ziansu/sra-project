public int launch() {
    try {
        java.net.ServerSocket myconnex = new java.net.ServerSocket(port, 6);
        this.state = STATE_LISTENING;
        int currentByte = -1;
        while (true) {
            java.net.Socket connexion = myconnex.accept();
            try {
                java.io.InputStream is = connexion.getInputStream();
                java.io.BufferedInputStream bis = new java.io.BufferedInputStream(is);
            } catch (java.io.IOException ex) {
                java.lang.System.err.println(ex);
            }
        } 
    } catch (java.io.IOException ex) {
        java.lang.System.err.println(ex);
    }
    return 0;
}