@org.springframework.context.annotation.Bean
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "spring.dataSource")
public javax.sql.DataSource getDataSource() {
    java.util.Locale.setDefault(java.util.Locale.ENGLISH);
    return new org.springframework.jdbc.datasource.DriverManagerDataSource();
}