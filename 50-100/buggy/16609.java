public void refuseConnection() {
    try {
        streamOut.writeUTF("Connection refused.");
        streamOut.flush();
    } catch (java.io.IOException ioe) {
        edu.wright.cs.jfiles.server.JFilesServer.print(("Error sending: " + (ioe.getMessage())));
    } finally {
        close();
    }
}