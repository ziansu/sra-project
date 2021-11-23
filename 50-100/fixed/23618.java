@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public com.atlas.entity.User getUserByEmail(java.lang.String email) {
    org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery("from User u where str(u.email) = :searchTerm");
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<com.atlas.entity.User> user = query.setParameter("searchTerm", email).list();
    if ((user.size()) != 0) {
        return user.get(0);
    }
    return null;
}