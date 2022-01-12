@org.springframework.context.annotation.Bean
public javax.sql.DataSource dataSource() {
    org.springframework.jdbc.datasource.DriverManagerDataSource dataSource = new org.springframework.jdbc.datasource.DriverManagerDataSource();
    dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
    dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
    dataSource.setUsername("jdbc.username");
    dataSource.setPassword("jdbc.password");
    return dataSource;
}