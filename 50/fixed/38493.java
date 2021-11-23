public boolean retrieveStreamsFromClients() {
    try {
        inputFromClient = new java.util.Scanner(clientSocket.getInputStream());
        outputToClient = new java.io.PrintWriter(clientSocket.getOutputStream(), true);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}