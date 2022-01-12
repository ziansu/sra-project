public static void removeClient(flee_and_catch.backend.communication.Client pClient) throws java.io.IOException {
    pClient.getBufferedReader().close();
    pClient.getOutputStream().close();
    pClient.setConnected(false);
    pClient.getSocket().close();
    flee_and_catch.backend.communication.Server.clients.remove(pClient);
}