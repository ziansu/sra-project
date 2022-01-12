public registration.model.Register findByColumn(java.lang.String column, java.lang.String value) {
    session = databaseClient.getSession();
    org.hibernate.Criteria criteria = session.createCriteria(registration.model.Register.class);
    registration.model.Register register = ((registration.model.Register) (criteria.add(org.hibernate.criterion.Restrictions.eq(column, value)).uniqueResult()));
    session.close();
    return register;
}