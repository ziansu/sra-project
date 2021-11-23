private boolean createConnection() {
    try {
        clientSocket = new java.net.Socket(SERVER_HOST, SERVER_PORT);
        outToServer = new java.io.DataOutputStream(clientSocket.getOutputStream());
        inFromServer = new java.io.BufferedReader(new java.io.InputStreamReader(clientSocket.getInputStream()));
        return true;
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("ExCC: " + e));
        return false;
    }
}