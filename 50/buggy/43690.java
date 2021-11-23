@java.lang.Override
public void close() throws java.sql.SQLException {
    connection.rollback();
    logger.fine("Connection returned.");
    sem.unlock();
}