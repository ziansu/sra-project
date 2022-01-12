protected <M> void deleteEntity(final java.lang.Class<M> modelClass, final java.lang.String modelId) {
    M model;
    javax.persistence.EntityManager em = de.zib.gndms.logic.model.ModelTaskAction.getEmf().createEntityManager();
    de.zib.gndms.model.util.TxFrame tx = new de.zib.gndms.model.util.TxFrame(em);
    try {
        model = em.find(modelClass, modelId);
        de.zib.gndms.logic.model.ModelTaskAction.getEntityManager().remove(model);
        tx.commit();
    } finally {
        tx.finish();
    }
}