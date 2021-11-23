public org.springframework.batch.core.Step step1() {
    return steps.get("step1").<com.example.Person, com.example.Person>chunk(10).reader(reader()).processor(processor()).writer(((org.springframework.batch.item.ItemWriter<? super com.example.Person>) (writter))).build();
}