@java.lang.Override
public void rollback() {
    try {
        if (logger.isInfoEnabled()) {
            logger.info("Rolling back transaction...");
        }
        connection.rollback();
    } finally {
        connection.close();
    }
}