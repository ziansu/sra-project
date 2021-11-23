@java.lang.Override
public void transactionEnd() {
    javax.persistence.EntityManager em = br.com.criativasoft.opendevice.middleware.persistence.HibernateProvider.getInstance();
    br.com.criativasoft.opendevice.middleware.persistence.HibernateProvider.setInstance(null);
    javax.persistence.EntityTransaction local = em.getTransaction();
    try {
        if (local.isActive())
            local.commit();
        
    } catch (java.lang.RuntimeException e) {
        if ((local != null) && (local.isActive()))
            local.rollback();
        
        throw e;
    } finally {
    }
}