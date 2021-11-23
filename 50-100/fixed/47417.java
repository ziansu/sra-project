@java.lang.Override
public java.util.List<com.beehyv.nmsreporting.model.FlwImportRejection> getAllRejectedFlwImportRecords(java.util.Date toDate) {
    org.hibernate.Criteria criteria = createEntityCriteria();
    criteria.add(org.hibernate.criterion.Restrictions.lt("modificationDate", toDate)).add(org.hibernate.criterion.Restrictions.eq("accepted", false));
    return criteria.list();
}