public void clearAllEntityManagers() {
    for (org.evosuite.runtime.javaee.javax.persistence.EvoEntityManager em : managers) {
        if (em != null) {
            if (((em.isOpen()) && (!(em.isJoinedToTransaction()))) && (em.getTransaction().isActive())) {
                em.getTransaction().rollback();
            }
            if (em.isOpen()) {
                em.close();
            }
        }
    }
    managers.clear();
}