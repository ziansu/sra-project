@java.lang.Override
public void run() {
    try {
        codeu.chat.server.Server.LOG.info("Handling connection...");
        final boolean success = onMessage(connection.in(), connection.out());
        codeu.chat.server.Server.LOG.info("Connection handled: %s", (success ? "ACCEPTED" : "REJECTED"));
    } catch (java.lang.Exception ex) {
        codeu.chat.server.Server.LOG.error(ex, "Exception while handling connection.");
    }
    try {
        connection.close();
    } catch (java.lang.Exception ex) {
        codeu.chat.server.Server.LOG.error(ex, "Exception while closing connection.");
    }
}