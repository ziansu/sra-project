public void close() {
    if (((closeEntityManager) && ((entityManager) != null)) && (entityManager.isOpen())) {
        try {
            entityManager.close();
        } catch (java.lang.IllegalStateException ise) {
            throw new org.flowable.engine.common.api.FlowableException("Error while closing EntityManager, may have already been closed or it is container-managed", ise);
        }
    }
}