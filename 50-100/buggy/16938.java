public static synchronized void closeConnection() {
    if ((client.overview.Connection.clientSocket) != null) {
        try {
            client.overview.Connection.outToServer.flush();
            client.overview.Connection.clientSocket.close();
            client.overview.Connection.clientSocket = null;
            client.overview.Connection.inFromServer = null;
            client.overview.Connection.outToServer = null;
            client.overview.Connection.connected = false;
        } catch (java.io.IOException e) {
            client.overview.Connection.logger.warn(("could not close socket: " + (e.getMessage())));
        }
    }
}