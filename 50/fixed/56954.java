@java.lang.Override
public java.io.PrintWriter getLogWriter() throws java.sql.SQLException {
    return originalDataSource.getLogWriter();
}