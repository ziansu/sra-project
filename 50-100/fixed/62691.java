protected void doClose() throws javax.jms.JMSException {
    boolean interrupted = java.lang.Thread.interrupted();
    shutdown();
    connection.removeSession(sessionInfo);
    connection.destroyResource(sessionInfo);
    if (interrupted) {
        java.lang.Thread.currentThread().interrupt();
    }
}