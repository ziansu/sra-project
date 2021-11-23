@java.lang.Override
public entity.Customer findCustomer(long id) {
    javax.persistence.EntityManager em = emf.createEntityManager();
    try {
        em.getTransaction().begin();
        entity.Customer c = em.find(entity.Customer.class, id);
        em.getTransaction().commit();
        return c;
    } finally {
        em.close();
    }
}