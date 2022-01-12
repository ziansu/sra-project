public void update(com.zynap.domain.IDomainObject domainObject) {
    try {
        getHibernateTemplate().update(domainObject);
    } catch (org.springframework.dao.DataAccessException e) {
        final java.lang.Throwable throwable = e.getCause();
        if (throwable instanceof net.sf.hibernate.NonUniqueObjectException) {
            getHibernateTemplate().evict(domainObject);
            getHibernateTemplate().update(domainObject);
            getHibernateTemplate().flush();
        }else
            throw e;
        
    }
}