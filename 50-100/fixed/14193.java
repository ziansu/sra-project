@java.lang.Override
public org.egov.ptis.domain.entity.property.PropertyStatusValues getLatestPropertyStatusValuesByPropertyIdAndreferenceNo(final java.lang.String PropertyId, final java.lang.String referenceNumber) {
    final org.hibernate.Query qry = getCurrentSession().createQuery(("from PropertyStatusValues PSV " + (" where PSV.basicProperty.upicNo =:PropertyId and PSV.referenceNo in (:referenceNumber) " + " order by PSV.createdDate desc"))).setMaxResults(1);
    qry.setString("PropertyId", PropertyId);
    qry.setString("referenceNumber", referenceNumber);
    return ((org.egov.ptis.domain.entity.property.PropertyStatusValues) (qry.uniqueResult()));
}