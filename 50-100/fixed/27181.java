@org.springframework.context.annotation.Bean
public org.springframework.batch.item.database.JdbcBatchItemWriter<hello.Person> writer() {
    org.springframework.batch.item.database.JdbcBatchItemWriter<hello.Person> writer = new org.springframework.batch.item.database.JdbcBatchItemWriter();
    writer.setItemSqlParameterSourceProvider(new org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider<hello.Person>());
    writer.setSql("INSERT INTO people (first_name, last_name) VALUES (:firstName, :lastName)");
    writer.setDataSource(dataSource);
    return writer;
}