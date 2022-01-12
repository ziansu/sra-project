@java.lang.Override
public com.litrum.webproject.model.ServiceOffered findServiceOfferedByName(java.lang.String name) {
    org.hibernate.Criteria criteria = getSession().createCriteria(getPersistentClass());
    criteria.add(org.hibernate.criterion.Restrictions.eq("name", name));
    return ((com.litrum.webproject.model.ServiceOffered) (criteria.uniqueResult()));
}