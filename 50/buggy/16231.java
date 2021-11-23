@org.springframework.context.annotation.Bean
public javax.sql.DataSource dataSource() {
    org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder builder = new org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder();
    org.springframework.jdbc.datasource.embedded.EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2).addScript("schema.sql").addScript("data.sql").build();
    return db;
}