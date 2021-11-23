public java.util.List<cmu.curantis.entities.VendorMgmtBean> getVendors(org.hibernate.Session session, cmu.curantis.entities.VendorMgmtBean ub) {
    long cicid = ub.getIdentity().getCircleId();
    org.hibernate.Query query = session.createQuery("from VendorMgmtBean where circleId = :circleId");
    query.setLong("circleId", cicid);
    java.util.List<cmu.curantis.entities.VendorMgmtBean> list = query.list();
    if ((list == null) || ((list.size()) == 0)) {
        return null;
    }
    return list;
}