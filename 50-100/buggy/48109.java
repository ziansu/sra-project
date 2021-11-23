@java.lang.Override
public void destroyToken(final java.lang.String token) {
    initPersistence();
    final org.hibernate.Session session = sessionFactory.getCurrentSession();
    final org.hibernate.Transaction transaction = session.beginTransaction();
    final edu.hm.swa.sh.abc3.authorize.persistence.entity.TokenEntity entity = session.load(edu.hm.swa.sh.abc3.authorize.persistence.entity.TokenEntity.class, token);
    if (entity != null) {
        session.delete(entity);
    }
    transaction.commit();
}