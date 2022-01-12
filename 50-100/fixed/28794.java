public java.lang.String save(gov.usgs.cida.coastalhazards.model.Alias alias) {
    javax.persistence.EntityTransaction transaction = em.getTransaction();
    java.lang.String aliasId;
    try {
        transaction.begin();
        em.persist(alias);
        transaction.commit();
        aliasId = alias.getId();
    } catch (java.lang.Exception ex) {
        if (transaction.isActive()) {
            transaction.rollback();
        }
        aliasId = null;
        throw ex;
    }
    return aliasId;
}