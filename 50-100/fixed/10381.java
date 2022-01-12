public void registerMbean() {
    if (!(mbeanRegistered)) {
        java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.Object>() {
            @java.lang.Override
            public java.lang.Object run() {
                javax.management.ObjectName objectName = com.alibaba.druid.stat.DruidDataSourceStatManager.addDataSource(com.alibaba.druid.pool.DruidDataSource.this, com.alibaba.druid.pool.DruidDataSource.this.name);
                com.alibaba.druid.pool.DruidDataSource.this.setObjectName(objectName);
                com.alibaba.druid.pool.DruidDataSource.this.mbeanRegistered = true;
                return null;
            }
        });
    }
}