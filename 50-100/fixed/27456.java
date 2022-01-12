public <T> void delete(T t) {
    javax.persistence.EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.remove(em.merge(t));
    em.getTransaction().commit();
    em.close();
}