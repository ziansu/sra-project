public org.egov.ptis.domain.entity.property.PropertyStatusValues getLatestPropertyStatusValuesByPropertyIdAndreferenceNo(java.lang.String PropertyId, java.lang.String referenceNumber) {
    org.hibernate.Query qry = getCurrentSession().createQuery(("from PropertyStatusValues PSV " + (" where PSV.basicProperty.upicNo =:PropertyId and PSV.referenceNo in (:referenceNumber) " + " order by PSV.createdDate desc"))).setMaxResults(1);
    qry.setString("PropertyId", PropertyId);
    qry.setString("referenceNumber", referenceNumber);
    return ((org.egov.ptis.domain.entity.property.PropertyStatusValues) (qry.uniqueResult()));
}