private java.net.Socket createDataConnection(int controlPort, java.io.DataOutputStream outToServer, java.lang.String sentence) {
    java.net.Socket dataSocket = null;
    try {
        int dataPort = controlPort + 2;
        java.net.ServerSocket welcomeData = new java.net.ServerSocket(dataPort);
        outToServer.writeBytes(((((dataPort + " ") + sentence) + " ") + '\n'));
        dataSocket = welcomeData.accept();
        welcomeData.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        return dataSocket;
    }
}