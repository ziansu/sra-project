@java.lang.Override
public boolean isWrapperFor(java.lang.Class<?> arg0) throws java.sql.SQLException {
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("called - isWrapperFor(Class<?> arg0)");
    return originalDataSource.isWrapperFor(arg0);
}