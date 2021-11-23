@java.lang.Override
public void commit() {
    try {
        if (logger.isInfoEnabled()) {
            logger.info("Commiting transaction...");
        }
        connection.commit();
    } finally {
        connection.close();
    }
}