public <T> void delete(T t) {
    javax.persistence.EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(t);
    em.remove(t);
    em.getTransaction().commit();
    em.close();
}