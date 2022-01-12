public java.util.List<models.City> getAllCity() {
    javax.persistence.EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
    javax.persistence.Query query = em.createQuery("from City");
    java.util.List resultList = query.getResultList();
    java.util.List<models.City> cities = new java.util.ArrayList<>();
    for (java.lang.Object city : resultList) {
        cities.add(((models.City) (city)));
    }
    em.close();
    return cities;
}