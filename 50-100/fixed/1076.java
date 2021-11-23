@org.springframework.context.annotation.Bean
public org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean();
    entityManagerFactoryBean.setDataSource(getDataSource());
    entityManagerFactoryBean.setPackagesToScan("model");
    entityManagerFactoryBean.setPersistenceProvider(new org.hibernate.jpa.HibernatePersistenceProvider());
    entityManagerFactoryBean.setJpaPropertyMap(getHibernateProperties());
    return entityManagerFactoryBean;
}