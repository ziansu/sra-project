@java.lang.Override
@javax.transaction.Transactional
public net.model.User checkUserAtRegistration(java.lang.String login, java.lang.String email) {
    org.hibernate.Session currentSession = sessionFactory.getCurrentSession();
    org.hibernate.Query query = currentSession.createQuery("from User where userLogin = :login and userEmail = :email");
    query.setParameter("login", login);
    query.setParameter("email", email);
    return (query.list().size()) == 0 ? null : new net.model.User();
}