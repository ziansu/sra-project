public boolean deleteAll() {
    boolean deleted = false;
    javax.persistence.EntityTransaction transaction = em.getTransaction();
    javax.persistence.Query deleteQuery = em.createQuery(gov.usgs.cida.coastalhazards.jpa.AliasManager.HQL_DELETE_ALL);
    try {
        transaction.begin();
        deleteQuery.executeUpdate();
        transaction.commit();
        deleted = true;
    } catch (java.lang.Exception ex) {
        if (transaction.isActive()) {
            transaction.rollback();
        }
        throw ex;
    }
    return deleted;
}