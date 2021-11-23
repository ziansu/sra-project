public T create(T t) {
    T tmp = null;
    javax.persistence.EntityManager em = entityManager;
    em.getTransaction().begin();
    if (t != null) {
        try {
            em.persist(t);
            em.getTransaction().commit();
            tmp = t;
        } catch (java.lang.Exception ex) {
            m.k.s.dailymeal.dao.GenericDAODailyMealImpl.LOG.error(ex);
            return tmp;
        }
    }
    return tmp;
}