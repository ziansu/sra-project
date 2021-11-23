@javax.annotation.PostConstruct
private void setupDatabase() {
    films = qa.persistence.generation.EntityGeneration.getSampleFilms();
    ratings = qa.persistence.generation.EntityGeneration.getSampleRatings();
    users = qa.persistence.generation.EntityGeneration.getSampleUsers();
    venues = qa.persistence.generation.EntityGeneration.getSampleVenues();
    viewings = qa.persistence.generation.EntityGeneration.getSampleViewings(new java.util.ArrayList(films), new java.util.ArrayList(venues));
}