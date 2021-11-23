@java.lang.Override
public java.util.List<T> findAll() {
    org.hibernate.Session session = de.parkand.verschlag.database.hibernate.GenericHibernateConnection.createSession();
    try {
        return findAll(classType, session);
    } catch (org.hibernate.HibernateException exception) {
        de.parkand.verschlag.database.hibernate.GenericHibernateConnection.logger.error(exception.getMessage(), exception);
        rollback(session);
        throw new javax.ws.rs.InternalServerErrorException(exception.getMessage());
    }
}