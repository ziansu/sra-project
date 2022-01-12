@java.lang.Override
public void run() {
    try {
        final boolean success = onMessage(connection.in(), connection.out());
    } catch (java.lang.Exception ex) {
        codeu.chat.server.Server.LOG.error(ex, "Exception while handling connection.");
    }
    try {
        connection.close();
    } catch (java.lang.Exception ex) {
        codeu.chat.server.Server.LOG.error(ex, "Exception while closing connection.");
    }
}