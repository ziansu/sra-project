@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<com.pfchoice.core.entity.MembershipInsurance> findAllByMbrId(final java.lang.Integer id) {
    org.hibernate.Criteria cr = getSession().createCriteria(getEntityClass(), "mbrIns").createAlias("mbrIns.mbr", "mbr").add(org.hibernate.criterion.Restrictions.eq("mbr.id", id));
    java.util.List<com.pfchoice.core.entity.MembershipInsurance> list = cr.list();
    return list;
}