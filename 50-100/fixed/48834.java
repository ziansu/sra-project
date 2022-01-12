private java.util.Properties hibernateProperties() {
    java.util.Properties properties = new java.util.Properties();
    properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
    properties.put("hibernate.show_sql", "true");
    properties.put("hibernate.format_sql", "true");
    properties.put("hibernate.use_sql_comments", "true");
    properties.put("hibernate.hbm2ddl.auto", "create-drop");
    properties.put("connection.autocommit", "false");
    return properties;
}