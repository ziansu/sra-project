@javax.transaction.Transactional
public com.hws.hibernate.models.User GetUserByLogin(java.lang.String login) {
    java.util.List<com.hws.hibernate.models.User> userList = new java.util.ArrayList<com.hws.hibernate.models.User>();
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    org.hibernate.Query query = session.createQuery("from User u where u.Login = :login");
    query.setParameter("login", login);
    userList = query.list();
    if ((userList.size()) == 0) {
        return null;
    }
    return userList.get(0);
}