@java.lang.Override
public java.util.List<org.ednovo.gooru.core.api.model.CollectionItem> getCollectionItems(java.lang.String parentId, int sequence, java.lang.String userUid) {
    org.hibernate.Query query = getSession().createQuery(org.ednovo.gooru.infrastructure.persistence.hibernate.CollectionDaoHibernate.GET_COLLECTIONITEM_BY_SEQUENCE);
    query.setParameter("parentId", parentId);
    query.setParameter(org.ednovo.gooru.infrastructure.persistence.hibernate.SEQUENCE, sequence);
    query.setParameter(org.ednovo.gooru.infrastructure.persistence.hibernate.USER_UID, userUid);
    return list(query);
}