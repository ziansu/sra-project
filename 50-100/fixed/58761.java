@org.springframework.context.annotation.Bean
public org.springframework.batch.item.file.FlatFileItemReader<hello.Person> reader() {
    org.springframework.batch.item.file.FlatFileItemReader<hello.Person> reader = new org.springframework.batch.item.file.FlatFileItemReader();
    reader.setResource(new org.springframework.core.io.ClassPathResource("sample-data.csv"));
    reader.setLineMapper(new org.springframework.batch.item.file.mapping.DefaultLineMapper<hello.Person>() {
        {
            setLineTokenizer(new org.springframework.batch.item.file.transform.DelimitedLineTokenizer() {
                {
                    setNames(new java.lang.String[]{ "firstName" , "lastName" });
                }
            });
            setFieldSetMapper(new org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper<hello.Person>() {
                {
                    setTargetType(hello.Person.class);
                }
            });
        }
    });
    return reader;
}