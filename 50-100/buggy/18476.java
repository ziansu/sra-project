private java.util.Properties getHibernateProperties() {
    java.util.Properties properties = new java.util.Properties();
    properties.put(woodstore.config.DataConfig.PROP_HIBERNATE_DIALECT, env.getRequiredProperty(woodstore.config.DataConfig.PROP_HIBERNATE_DIALECT));
    properties.put(woodstore.config.DataConfig.PROP_HIBERNATE_SHOW_SQL, env.getRequiredProperty(woodstore.config.DataConfig.PROP_HIBERNATE_SHOW_SQL));
    properties.put(woodstore.config.DataConfig.PROP_HIBERNATE_HBM2DDL_AUTO, env.getRequiredProperty(woodstore.config.DataConfig.PROP_HIBERNATE_HBM2DDL_AUTO));
    return properties;
}