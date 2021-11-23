@org.springframework.context.annotation.Bean
public javax.persistence.EntityManagerFactory entityManagerFactory() {
    java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.INFO);
    org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter vendorAdapter = new org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter();
    vendorAdapter.setShowSql(true);
    vendorAdapter.setGenerateDdl(false);
    vendorAdapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
    org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean factory = new org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean();
    factory.setJpaVendorAdapter(vendorAdapter);
    factory.setPackagesToScan("com.teamd.taxi.entity");
    factory.setDataSource(dataSource());
    factory.afterPropertiesSet();
    return factory.getObject();
}