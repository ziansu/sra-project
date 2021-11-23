@java.lang.Override
public java.util.List<org.ednovo.gooru.core.api.model.CollectionItem> getCollectionItemsByResource(java.lang.String resourceId) {
    org.hibernate.Query query = getSession().createQuery(org.ednovo.gooru.infrastructure.persistence.hibernate.CollectionRepositoryHibernate.COLLECTION_ITEM_BY_RESOURCE);
    query.setParameter("resourceId", resourceId);
    return query.list();
}