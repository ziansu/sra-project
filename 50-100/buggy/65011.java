public void update(java.lang.Object relationLink) {
    javax.persistence.EntityManager em = daoManager.getEntityManagerFactory().createEntityManager();
    try {
        daoManager.startTransaction(em);
        em.merge(relationLink);
        daoManager.commitTransaction(em);
        em.refresh(relationLink);
    } catch (java.lang.Exception ex) {
        io.subutai.core.object.relation.impl.dao.RelationDataService.logger.error("Error persisting object", ex);
        daoManager.rollBackTransaction(em);
    } finally {
        daoManager.closeEntityManager(em);
    }
}