@org.springframework.context.annotation.Bean
public org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean();
    entityManagerFactoryBean.setDataSource(getDataSource());
    entityManagerFactoryBean.setPackagesToScan("model");
    entityManagerFactoryBean.setPersistenceProvider(new org.hibernate.jpa.HibernatePersistenceProvider());
    entityManagerFactoryBean.setJpaPropertyMap(getHibernateProperties());
    java.lang.Object file = entityManagerFactoryBean.getJpaPropertyMap().get("hibernate.hbm2ddl.import_files");
    configuration.database.DataBaseContextConfiguration.logger.error(("Got the following file to export  " + file));
    return entityManagerFactoryBean;
}