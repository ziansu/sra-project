@java.lang.Override
public java.util.logging.Logger getParentLogger() throws java.sql.SQLFeatureNotSupportedException {
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("called - getParentLogger()");
    throw new java.sql.SQLFeatureNotSupportedException();
}