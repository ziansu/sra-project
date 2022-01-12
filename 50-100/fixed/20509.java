public com.javamonkeys.dao.user.User getUserByToken(java.lang.String token) {
    if (token == null)
        return null;
    
    org.hibernate.Query query = getSession().createQuery("from User where token = :token");
    query.setParameter("token", token);
    java.util.List result = query.list();
    if (result.isEmpty()) {
        return null;
    }else {
        return ((com.javamonkeys.dao.user.User) (result.get(0)));
    }
}