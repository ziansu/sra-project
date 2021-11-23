public int insertCustomUserType(java.lang.String userType, java.lang.String uuid) {
    if (!(checkExistUserType(userType))) {
        org.hibernate.Query sqlQuery = sessionFactory.getCurrentSession().getNamedQuery("insertToCustomUserType");
        sqlQuery.setParameter("user_type", userType);
        sqlQuery.setParameter("uuid", uuid);
        return sqlQuery.executeUpdate();
    }else {
        return -1;
    }
}