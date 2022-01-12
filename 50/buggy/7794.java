@java.lang.Override
public void close() throws java.sql.SQLException {
    checkClosed();
    result = null;
    row = -1;
    isClosed = true;
    currentRow = null;
}