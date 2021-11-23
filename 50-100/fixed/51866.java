@com.google.inject.persist.Transactional
public java.util.List<org.candlepin.model.Pool> listSharedPoolsOf(org.candlepin.model.Pool pool) {
    return listByCriteria(currentSession().createCriteria(org.candlepin.model.Pool.class).createAlias("sourceEntitlement", "se").createAlias("se.pool", "sep").add(org.hibernate.criterion.Restrictions.eq("createdByShare", java.lang.Boolean.TRUE)).add(org.hibernate.criterion.Restrictions.eq("se.pool", pool)).addOrder(org.hibernate.criterion.Order.desc("created")));
}