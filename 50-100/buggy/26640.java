private java.lang.String getJmxResult(javax.management.MBeanServerConnection connetion, java.lang.String url) throws java.lang.Exception {
    javax.management.ObjectName name = new javax.management.ObjectName(com.alibaba.druid.stat.DruidStatService.MBEAN_NAME);
    java.lang.String result = ((java.lang.String) (conn.invoke(name, "service", new java.lang.String[]{ url }, new java.lang.String[]{ java.lang.String.class.getName() })));
    return result;
}