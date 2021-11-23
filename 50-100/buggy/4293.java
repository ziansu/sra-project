@java.lang.Override
public edu.hm.swa.sh.abc3.authorize.common.UserDTO getUser(final long userid) {
    initPersistence();
    final org.hibernate.Session session = sessionFactory.getCurrentSession();
    final org.hibernate.Transaction transaction = session.beginTransaction();
    final edu.hm.swa.sh.abc3.authorize.persistence.entity.UserEntity result = session.find(edu.hm.swa.sh.abc3.authorize.persistence.entity.UserEntity.class, userid);
    transaction.commit();
    return userTransformer.toUserDTO(result);
}