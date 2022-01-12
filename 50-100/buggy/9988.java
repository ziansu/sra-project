@java.lang.Override
protected synchronized void analyzeScrimmageMatch(model.BSScrimmageSet scrim) {
    javax.persistence.EntityManager em = common.HibernateUtil.getEntityManager();
    em.persist(scrim);
    em.getTransaction().begin();
    em.flush();
    em.getTransaction().commit();
    em.refresh(scrim);
    em.close();
    master.WebSocketChannelManager.broadcastMsg("scrimmage", "INSERT_TABLE_ROW", (((scrim.getId()) + ",") + (scrim.getFileName())));
    startRun();
}