private java.util.Properties getHibernateProperties() {
    java.util.Properties properties = new java.util.Properties();
    properties.put("hibernate.dialect", env.getProperty(com.project.shopping_Backend.config.HibernateConfig.DATABASE_DIALECT));
    properties.put("hibernate.show_sql", env.getProperty(com.project.shopping_Backend.config.HibernateConfig.HIBERNATE_SHOW_SQL));
    properties.put("hibernate.format_sql", env.getProperty(com.project.shopping_Backend.config.HibernateConfig.HIBERNATE_FORMAT_SQL));
    return properties;
}