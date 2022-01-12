@org.springframework.context.annotation.Bean
public org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean em = new org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean();
    em.setDataSource(dataSource());
    em.setPackagesToScan("com.github.gokolo.personaldashboard.data.entities");
    org.springframework.orm.jpa.JpaVendorAdapter vendorAdapter = new org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter();
    em.setJpaVendorAdapter(vendorAdapter);
    em.setJpaProperties(additionalProperties());
    return em;
}