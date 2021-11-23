private org.hibernate.Session getParallelSession() {
    if ((parallelToSynchronizationSession) == null) {
        parallelToSynchronizationSession = sessionFactory.openSession();
    }
    return parallelToSynchronizationSession;
}