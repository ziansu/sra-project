public void delete(com.zynap.domain.IDomainObject domainObject) throws com.zynap.exception.TalentStudioException {
    getHibernateTemplate().delete(domainObject);
}