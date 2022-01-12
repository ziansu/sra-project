@org.springframework.context.annotation.Bean
public org.springframework.jdbc.core.JdbcTemplate getJdbcTemplate() {
    return new org.springframework.jdbc.core.JdbcTemplate(new conf.DataSourceInitializer().getDataSource());
}