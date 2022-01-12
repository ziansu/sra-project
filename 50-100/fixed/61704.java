private static void store(java.util.List<entity.TravelPossibility> travelPossibilities) {
    javax.persistence.EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("TravelPossibilityPersistence");
    javax.persistence.EntityManager entityManager = emf.createEntityManager();
    entityManager.getTransaction().begin();
    for (entity.TravelPossibility possibility : travelPossibilities) {
        entityManager.persist(new entity.TravelPossibilityJpaEntity(possibility));
    }
    entityManager.getTransaction().commit();
    entityManager.close();
    emf.close();
}