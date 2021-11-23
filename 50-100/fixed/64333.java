private org.apache.hive.jdbc.HiveConnection getHiveConnection(com.google.common.base.Optional<java.lang.String> proxyUser) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.Class.forName("org.apache.hive.jdbc.HiveDriver");
    com.google.common.base.Preconditions.checkArgument(this.state.contains(ComplianceConfigurationKeys.HIVE_JDBC_URL), ("Missing required property " + (ComplianceConfigurationKeys.HIVE_JDBC_URL)));
    java.lang.String url = this.state.getProp(ComplianceConfigurationKeys.HIVE_JDBC_URL);
    if (proxyUser.isPresent()) {
        url = (url + (ComplianceConfigurationKeys.HIVE_SERVER2_PROXY_USER)) + (proxyUser.get());
    }
    return ((org.apache.hive.jdbc.HiveConnection) (java.sql.DriverManager.getConnection(url)));
}