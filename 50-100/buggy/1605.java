public static void incrementQuantity(int quantity, long id) {
    org.apache.ibatis.session.SqlSession session = com.devsolutions.camelus.services.DBConnection.getSqlSessionFactory().openSession();
    session.getMapper(com.devsolutions.camelus.mappers.ProductMapper.class).incrementQuantity(quantity, id);
    session.commit();
    session.close();
    com.devsolutions.camelus.auditing.AuditUtils.getAuditingService().setAudit(new com.devsolutions.camelus.auditing.Audit(Session.vendor.getLogin(), com.devsolutions.camelus.auditing.AuditTypes.UPDATE, ("a modifier un produit id : " + id)));
    com.devsolutions.camelus.auditing.AuditUtils.getAuditingService().start();
}