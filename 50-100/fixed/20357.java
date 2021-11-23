@java.lang.Override
public com.aug.hrdb.entities.Language findIdJoinEmployee(java.lang.Integer id) {
    org.hibernate.Criteria c = getCurrentSession().createCriteria(com.aug.hrdb.entities.Language.class, "language");
    c.setFetchMode("applicant", FetchMode.JOIN);
    c.createAlias("applicant", "applicant");
    c.add(org.hibernate.criterion.Restrictions.eq("language.id", id));
    com.aug.hrdb.entities.Language language = ((com.aug.hrdb.entities.Language) (c.uniqueResult()));
    return language;
}