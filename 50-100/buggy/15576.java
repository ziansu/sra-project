@java.lang.Override
public T getByField(java.lang.String name, java.lang.Object value) {
    org.hibernate.Session session = hospital.repositories.DbSessionFactory.get();
    T foundValue = null;
    try {
        org.hibernate.Criteria criteria = session.createCriteria(type);
        foundValue = ((T) (criteria.add(org.hibernate.criterion.Restrictions.eq(name, value)).uniqueResult()));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    } finally {
        session.close();
    }
    return foundValue;
}