@java.lang.Override
public java.util.List<com.beehyv.nmsreporting.model.FlwImportRejection> getAllRejectedFlwImportRecordsWithBlockId(java.util.Date toDate, java.lang.Integer blockId) {
    org.hibernate.Criteria criteria = createEntityCriteria();
    criteria.add(org.hibernate.criterion.Restrictions.lt("modificationDate", toDate)).add(org.hibernate.criterion.Restrictions.eq("accepted", true)).add(org.hibernate.criterion.Restrictions.eq("blockId", blockId));
    return criteria.list();
}