public java.lang.String update(gov.usgs.cida.coastalhazards.model.Alias alias) {
    javax.persistence.EntityTransaction transaction = em.getTransaction();
    java.lang.String aliasId;
    try {
        transaction.begin();
        em.merge(alias);
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