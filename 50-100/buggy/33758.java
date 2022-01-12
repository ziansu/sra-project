private static void getName(javax.management.remote.JMXConnector c) throws java.io.IOException, javax.management.AttributeNotFoundException, javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.MalformedObjectNameException, javax.management.ReflectionException {
    java.lang.String query = "com.mchange.v2.c3p0:type=PooledDataSource*";
    java.util.Set<javax.management.ObjectName> qr = com.qsm.jvmmonitor.JMXCommonService.queryNames(c, query);
    for (javax.management.ObjectName on : qr) {
        java.lang.String dsn = ((java.lang.String) (c.getMBeanServerConnection().getAttribute(on, "dataSourceName")));
        com.qsm.jvmmonitor.C3P0Service.data_source_name.add((("[" + dsn) + "]"));
    }
}