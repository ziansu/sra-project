public org.springframework.batch.core.Step step1() {
    return steps.get("step1").<com.example.Person, com.example.Person>chunk(10).reader(reader()).processor(processor()).writer(writter.writer()).build();
}