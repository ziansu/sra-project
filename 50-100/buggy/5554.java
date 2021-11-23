@java.lang.Override
public javax.sql.DataSource provide(java.lang.String driverClass, java.lang.String url, java.lang.String user, java.lang.String password, java.util.Properties jdbcProperties) {
    com.mchange.v2.c3p0.ComboPooledDataSource cpds = new com.mchange.v2.c3p0.ComboPooledDataSource();
    try {
        cpds.setDriverClass(driverClass);
        cpds.setJdbcUrl(url);
        cpds.setUser(url);
        cpds.setPassword(user);
        cpds.setProperties(jdbcProperties);
        return cpds;
    } catch (java.beans.PropertyVetoException e) {
        throw org.seedstack.seed.core.api.SeedException.wrap(e, JdbcErrorCode.WRONG_JDBC_DRIVER);
    }
}