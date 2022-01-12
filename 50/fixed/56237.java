private java.util.Properties getHibernateProperties() {
    java.util.Properties properties = new java.util.Properties();
    properties.put("hibernate.show_sql", "false");
    properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
    properties.put("hibernate.hbm2ddl.auto", "update");
    java.lang.System.out.println("HibernateProperties");
    return properties;
}