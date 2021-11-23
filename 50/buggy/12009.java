public void delete(java.lang.String email) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    com.cloud.entities.User user = ((com.cloud.entities.User) (session.get(com.cloud.entities.User.class, email)));
    session.delete(user);
}