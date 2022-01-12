@org.springframework.context.annotation.Bean
public javax.sql.DataSource dataSource() {
    org.springframework.jdbc.datasource.DriverManagerDataSource dataSource = new org.springframework.jdbc.datasource.DriverManagerDataSource();
    dataSource.setDriverClassName(environment.getProperty(hu.iit.uni.miskolc.nemeth.webdev.daoimpl.configuration.DaoApplicationContextConfig.DB_DRIVER_PROPERTY));
    dataSource.setUrl(environment.getProperty(hu.iit.uni.miskolc.nemeth.webdev.daoimpl.configuration.DaoApplicationContextConfig.DB_URL_PROPERTY));
    dataSource.setUsername(environment.getProperty(hu.iit.uni.miskolc.nemeth.webdev.daoimpl.configuration.DaoApplicationContextConfig.DB_USERNAME_PROPERTY));
    dataSource.setPassword(environment.getProperty(hu.iit.uni.miskolc.nemeth.webdev.daoimpl.configuration.DaoApplicationContextConfig.DB_PASSWORD_PROPERTY));
    return dataSource();
}