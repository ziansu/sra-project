@java.lang.Override
public T getByField(java.lang.String name, java.lang.Object value) {
    T foundValue = null;
    try {
        org.hibernate.Criteria criteria = session.createCriteria(type);
        foundValue = ((T) (criteria.add(org.hibernate.criterion.Restrictions.eq(name, value)).uniqueResult()));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
    return foundValue;
}