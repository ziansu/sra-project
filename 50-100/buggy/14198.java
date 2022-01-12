private java.util.Properties hibernateProperties() {
    com.vincent.SSHProject.configuration.DBConfig.logger.info("hibernate properties");
    java.util.Properties properties = new java.util.Properties();
    properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
    properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
    properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
    return properties;
}