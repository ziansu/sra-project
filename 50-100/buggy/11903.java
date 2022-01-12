@org.springframework.context.annotation.Bean(destroyMethod = "close")
public javax.persistence.EntityManagerFactory entityManagerFactory() throws java.io.IOException, java.sql.SQLException, javax.xml.bind.JAXBException {
    org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter vendorAdapter = new org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter();
    vendorAdapter.setGenerateDdl(true);
    vendorAdapter.setShowSql(false);
    org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean factory = new org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean();
    factory.setJpaVendorAdapter(vendorAdapter);
    factory.setJpaDialect(new org.springframework.orm.jpa.vendor.HibernateJpaDialect());
    factory.setJpaProperties(getAdditionalProperties());
    factory.setPackagesToScan("ch.bfh.btx8201.cdss4nsar.democis.data");
    factory.setDataSource(dataSource());
    factory.afterPropertiesSet();
    return factory.getObject();
}