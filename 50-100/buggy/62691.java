protected void doClose() throws javax.jms.JMSException {
    boolean interrupted = java.lang.Thread.interrupted();
    shutdown();
    try {
        transactionContext.rollback();
    } catch (javax.jms.JMSException e) {
    }
    connection.removeSession(sessionInfo);
    connection.destroyResource(sessionInfo);
    if (interrupted) {
        java.lang.Thread.currentThread().interrupt();
    }
}