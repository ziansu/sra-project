public int insertCustomUserSubType(java.lang.String userSubType, java.lang.String ID, java.lang.String userTypeId) {
    if (!(checkExistUserSubType(userSubType))) {
        org.hibernate.Query sqlQuery = sessionFactory.getCurrentSession().getNamedQuery("insertToCustomUserSubType");
        sqlQuery.setParameter("user_sub_type", userSubType);
        sqlQuery.setParameter("custom_user_type_id", userTypeId);
        sqlQuery.setParameter("id", ID);
        return sqlQuery.executeUpdate();
    }else {
        return -1;
    }
}