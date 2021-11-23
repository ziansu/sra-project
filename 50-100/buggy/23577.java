private java.util.Properties hibernateProperties() {
    java.util.Properties props = new java.util.Properties();
    props.setProperty("hibernate.dialect", environment.getRequiredProperty("nextrtc.db.dialect"));
    props.setProperty("hibernate.hbm2ddl.auto", environment.getProperty("nextrtc.db.hbm2ddl", "validate"));
    props.setProperty("hibernate.show_sql", "true");
    props.setProperty("hibernate.format_sql", "true");
    props.setProperty("hibernate.ejb.naming_strategy", "org.hibernate.cfg.DefaultNamingStrategy");
    props.setProperty("hibernate.cache.use_second_level_cache", "false");
    props.setProperty("jadira.usertype.autoRegisterUserTypes", "true");
    return props;
}