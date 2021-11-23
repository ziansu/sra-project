@org.springframework.context.annotation.Bean
public org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean entityManagerFactory(javax.sql.DataSource dataSource, org.springframework.orm.jpa.JpaVendorAdapter adapter) {
    org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean emfb = new org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean();
    java.lang.System.out.println(" *** Initialize JPA EntityManagerFactory using PU - minimum !!! ***");
    emfb.setDataSource(dataSource);
    emfb.setPersistenceUnitName("spit-sample-PU");
    return emfb;
}