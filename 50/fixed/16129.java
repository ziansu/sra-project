public javax.persistence.EntityManager getEntityManager() {
    return this.emf.createEntityManager();
}