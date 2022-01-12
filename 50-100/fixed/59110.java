public registration.model.Register findByColumn(java.lang.String column, java.lang.String value) {
    session = databaseClient.getSession();
    org.hibernate.Criteria criteria = session.createCriteria(registration.model.Register.class);
    java.lang.System.out.println(value);
    registration.model.Register register = ((registration.model.Register) (criteria.add(org.hibernate.criterion.Restrictions.eq(column, value)).uniqueResult()));
    java.lang.System.out.println(register);
    session.close();
    return register;
}