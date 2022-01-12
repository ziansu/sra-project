public void listen() {
    while (true) {
        try {
            java.net.ServerSocket listener = new java.net.ServerSocket(this.getServerList().get(myId).getPortNumber());
            java.net.Socket s;
            while ((s = listener.accept()) != null) {
                processRequest(s);
            } 
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    } 
}