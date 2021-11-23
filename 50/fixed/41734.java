public final com.zynap.domain.IDomainObject create(com.zynap.domain.IDomainObject domainObject) {
    getHibernateTemplate().save(domainObject);
    return domainObject;
}