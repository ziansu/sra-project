@org.springframework.context.annotation.Bean
public javax.persistence.EntityManagerFactory entityManagerFactory(final javax.sql.DataSource dataSource) {
    org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter vendorAdapter = new org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter();
    vendorAdapter.setGenerateDdl(true);
    org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean factory = new org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean();
    factory.setJpaVendorAdapter(vendorAdapter);
    factory.setJpaDialect(new org.springframework.orm.jpa.DefaultJpaDialect());
    factory.setPackagesToScan("com.weframe");
    factory.setDataSource(dataSource);
    factory.afterPropertiesSet();
    return factory.getObject();
}