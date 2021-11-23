@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true)
public java.util.List<me.sergienko.model.Student> getRecordsLimitOffset(java.lang.Integer limit, java.lang.Integer offset) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    org.hibernate.Criteria criteria = session.createCriteria(me.sergienko.model.Student.class);
    criteria.setFirstResult(offset);
    criteria.setMaxResults(limit);
    return ((java.util.List<me.sergienko.model.Student>) (criteria.list()));
}