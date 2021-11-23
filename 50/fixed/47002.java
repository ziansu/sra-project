@org.springframework.context.annotation.Bean
public javax.sql.DataSource dataSource() {
    return new org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder().generateUniqueName(true).setType(EmbeddedDatabaseType.H2).setScriptEncoding("UTF-8").ignoreFailedDrops(true).addScript("schema.sql").build();
}