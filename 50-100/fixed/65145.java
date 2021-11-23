@java.lang.Override
public void updateToken(final edu.hm.swa.sh.abc3.authorize.common.TokenDTO token) {
    final org.hibernate.Session session = sessionFactory.getCurrentSession();
    final org.hibernate.Transaction transaction = session.beginTransaction();
    final edu.hm.swa.sh.abc3.authorize.persistence.entity.TokenEntity entity = session.find(edu.hm.swa.sh.abc3.authorize.persistence.entity.TokenEntity.class, token.getToken());
    if (entity != null) {
        entity.setTtl(token.getTimeToLive());
        session.merge(entity);
    }
    transaction.commit();
}