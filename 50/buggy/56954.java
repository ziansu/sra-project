@java.lang.Override
public java.io.PrintWriter getLogWriter() throws java.sql.SQLException {
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("called - getLogWriter()");
    return originalDataSource.getLogWriter();
}