@org.springframework.web.bind.annotation.GetMapping
java.util.List<com.example.sbjasperangular.cassandra.model.Person> getPersonAll() {
    return service.findAll();
}