@java.lang.Override
public boolean postLocation(com.ibm.bh6.model.Location location) {
    javax.persistence.EntityManager em = com.ibm.bh6.dao.DBHandler.getEntityManager();
    em.getTransaction().begin();
    em.persist(location);
    em.getTransaction().commit();
    return true;
}