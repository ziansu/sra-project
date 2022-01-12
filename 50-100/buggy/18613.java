public boolean create(java.lang.String serverIP, int serverPort) {
    if ((socket) == null) {
        try {
            java.net.InetAddress serverAddr = java.net.InetAddress.getByName(serverIP);
            socket = new java.net.Socket(serverAddr, serverPort);
            return true;
        } catch (java.io.IOException ioe) {
            helper.ErrorLogger.log(model.ConnectingServer.class, ioe);
        }
    }
    return false;
}