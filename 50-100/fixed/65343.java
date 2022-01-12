public int insertCustomUserType(java.lang.String userType, java.lang.String uuid) {
    org.hibernate.Query sqlQuery = sessionFactory.getCurrentSession().getNamedQuery("insertToCustomUserType");
    sqlQuery.setParameter("user_type", userType);
    sqlQuery.setParameter("uuid", uuid);
    return sqlQuery.executeUpdate();
}