@java.lang.Override
public java.util.List<T> findAll() {
    org.hibernate.Session session = de.parkand.verschlag.database.hibernate.GenericHibernateConnection.createSession();
    try {
        java.util.List<T> list = findAll(classType, session);
        return list;
    } catch (org.hibernate.HibernateException exception) {
        de.parkand.verschlag.database.hibernate.GenericHibernateConnection.logger.error(exception.getMessage(), exception);
        rollback(session);
        throw new javax.ws.rs.InternalServerErrorException(exception.getMessage());
    }
}