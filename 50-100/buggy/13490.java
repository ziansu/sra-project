public void deleteActorGroup(java.util.List<org.jcvi.ometa.db_interface.ActorGroup> actorGroups) throws java.lang.Exception {
    try {
        org.jcvi.ometa.db_interface.ActorDAO actorDAO = daoFactory.getActorDAO();
        actorDAO.deleteActorGroup(actorGroups, session);
        sessionAndTransactionManager.commitTransaction();
    } catch (java.lang.Exception ex) {
        sessionAndTransactionManager.rollBackTransaction();
        throw ex;
    } finally {
        sessionAndTransactionManager.closeSession();
    }
}