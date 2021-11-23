@org.springframework.web.bind.annotation.GetMapping
java.util.List<com.example.sbjasperangular.cassandra.model.Person> getPersonAll() {
    java.util.stream.Stream<com.example.sbjasperangular.cassandra.model.Person> st = service.findAll();
    return st.collect(java.util.stream.Collectors.toList());
}