private void closeServer() throws java.io.IOException {
    outToServer.writeObject("close");
    serverSocket.close();
    currentlyPlayingSocket.close();
    java.lang.System.exit(0);
}