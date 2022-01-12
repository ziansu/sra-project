@javax.annotation.PostConstruct
public void createData() {
    request.createStudent("94121501372", java.util.Date.from(java.time.Instant.now()), "Adam Nowak");
    request.createStudent("93121501372", java.util.Date.from(java.time.Instant.now()), "Marcin Adamski");
    request.createStudent("93721501372", java.util.Date.from(java.time.Instant.now()), "Maciej Adam");
    request.addGrade("94121501372", "74121501372", 6, java.util.Date.from(java.time.Instant.now()));
}