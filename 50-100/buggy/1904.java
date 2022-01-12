@java.lang.Override
public org.ednovo.gooru.core.api.model.CollectionItem getCollectionItemByResource(java.lang.String resourceId) {
    org.hibernate.Query query = getSession().createQuery(org.ednovo.gooru.infrastructure.persistence.hibernate.CollectionRepositoryHibernate.COLLECTION_ITEM_BY_RESOURCE);
    query.setParameter("resourceId", resourceId);
    return ((org.ednovo.gooru.core.api.model.CollectionItem) ((query.list().size()) > 0 ? query.list().get(0) : null));
}