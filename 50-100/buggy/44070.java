@org.springframework.context.annotation.Bean
public org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter vendorAdapter = new org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter();
    vendorAdapter.setDatabase(Database.MYSQL);
    vendorAdapter.setGenerateDdl(true);
    vendorAdapter.setShowSql(true);
    org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean factory = new org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean();
    factory.setJpaVendorAdapter(vendorAdapter);
    factory.setPackagesToScan(com.perqin.focus.spring.domain.entities.EntityScanned.class.getPackage().toString());
    factory.setDataSource(dataSource());
    factory.setJpaProperties(jpaProperties());
    return factory;
}