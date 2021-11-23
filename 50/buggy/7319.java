@java.lang.Override
public void setLogWriter(java.io.PrintWriter arg0) throws java.sql.SQLException {
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("called - setLogWriter(PrintWriter arg0)");
    originalDataSource.setLogWriter(arg0);
}