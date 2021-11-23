@org.springframework.context.annotation.Bean(name = "dataSource")
public javax.sql.DataSource getDataSource() {
    javax.sql.DataSource dataSource = createDataSource();
    return dataSource;
}