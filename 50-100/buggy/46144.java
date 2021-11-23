@java.lang.Override
public void saveMessageChain(org.csstudio.ams4.material.messagechain.MessageChainConfiguration databaseMessageChain) {
    synchronized(parallelSynchronization) {
        if (databaseType.equals(org.csstudio.ams4.service.db.HibernateDBService.Type.APPLICATION)) {
            org.hibernate.Session session = getParallelSession();
            try {
                session.getTransaction().begin();
                session.saveOrUpdate(databaseMessageChain);
                session.getTransaction().commit();
            } catch (java.lang.Throwable e) {
                session.getTransaction().rollback();
                org.csstudio.ams4.service.db.HibernateDBService.log.error("DB Error:", e);
            }
        }
    }
}