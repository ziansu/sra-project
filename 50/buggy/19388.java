protected java.util.List findAll(org.hibernate.Session session, java.lang.Class clz, com.advantech.jqgrid.PageInfo info) {
    org.hibernate.Criteria criteria = session.createCriteria(clz);
    return this.findAll(criteria, info);
}