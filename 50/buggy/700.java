public boolean persist(DataAccess.Entity.User user) {
    javax.persistence.EntityManager em = emf1.createEntityManager();
    em.getTransaction().begin();
    em.persist(user);
    em.getTransaction().commit();
    return true;
}